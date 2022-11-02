package exercicios5.controllers;

import exercicios5.dto.TelefoneRM;
import exercicios5.dto.UsuarioRM;
import exercicios5.input.UsuarioInput;
import exercicios5.models.TelefoneModel;
import exercicios5.models.UsuarioModel;
import exercicios5.services.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private CadastroUsuarioService cadastroUsuarioService;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioRM> cadastrar(@RequestBody UsuarioInput usuarioInput) {
        UsuarioModel user = cadastroUsuarioService.salvar(toDomainObject(usuarioInput));
        return new ResponseEntity<UsuarioRM>(toModel(user), HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioRM> atualizar(@RequestBody UsuarioInput usuarioInput) {
        UsuarioModel user = cadastroUsuarioService.salvar(toDomainObject(usuarioInput));
        return new ResponseEntity<UsuarioRM>(toModel(user), HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idUsuario) {
        cadastroUsuarioService.deletar(idUsuario);
        return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/{idUsuario}", produces = "application/json")
    public ResponseEntity<UsuarioRM> buscar(@PathVariable(value = "idUsuario") Long idUsuario) {
        UsuarioModel user = cadastroUsuarioService.buscar(idUsuario);
        UsuarioRM userRM = toModel(user);
        return new ResponseEntity<UsuarioRM>(userRM, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<UsuarioRM>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<UsuarioModel> users = cadastroUsuarioService.buscarPorNome(nome);
        List<UsuarioRM> usersRM = toCollectionModel(users);
        return new ResponseEntity<List<UsuarioRM>>(usersRM, HttpStatus.OK);
    }

    private UsuarioRM toModel(UsuarioModel user) {
        UsuarioRM userRM = new UsuarioRM();
        userRM.setId(user.getId());
        userRM.setLogin(user.getLogin());
        userRM.setNome(user.getNome());
        userRM.setDataCadastro(user.getDataCadastro());
        userRM.setDataAtualizacao(user.getDataAtualizacao());
        for (int i=0; i<user.getTelefones().size(); i++){
            TelefoneRM telRM = new TelefoneRM();
            telRM.setId(user.getTelefones().get(i).getId());
            telRM.setNumero(user.getTelefones().get(i).getNumero());
            telRM.setTipo(user.getTelefones().get(i).getTipo());
            userRM.getTelefones().add(telRM);
        }
        return userRM;
    }

    private List<UsuarioRM> toCollectionModel(List<UsuarioModel> usuariosModels) {
        return usuariosModels.stream().map(usuarioModel -> toModel(usuarioModel)).collect(Collectors.toList());
    }

    private UsuarioModel toDomainObject(UsuarioInput usuarioInput){
        UsuarioModel user = new UsuarioModel();
        user.setId(usuarioInput.getId());
        user.setNome(usuarioInput.getNome());
        user.setLogin(usuarioInput.getLogin());
        user.setSenha(usuarioInput.getSenha());
        for (int i=0; i<usuarioInput.getTelefones().size(); i++){
            TelefoneModel tel = new TelefoneModel();
            tel.setId(user.getTelefones().get(i).getId());
            tel.setNumero(user.getTelefones().get(i).getNumero());
            tel.setTipo(user.getTelefones().get(i).getTipo());
            user.getTelefones().add(tel);
        }
        return user;
    }
}
