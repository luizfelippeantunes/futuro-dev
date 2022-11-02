package exercicios5.controllers;

import exercicios5.dto.TelefoneRM;
import exercicios5.dto.UsuarioRM;
import exercicios5.input.UsuarioInput;
import exercicios5.models.Telefone;
import exercicios5.models.Usuario;
import exercicios5.services.CadastroUsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"http://app.floripa.com:9000", "http://app.saopaulo.com:9000"})
@Api(tags = "Usuários")
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private CadastroUsuarioService cadastroUsuarioService;

    @ApiOperation("Salva um usuário")
    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioRM> cadastrar(@RequestBody UsuarioInput usuarioInput) {
        Usuario user = cadastroUsuarioService.salvar(toDomainObject(usuarioInput));
        return new ResponseEntity<UsuarioRM>(toModel(user), HttpStatus.CREATED);
    }

    @ApiOperation("Atualiza um usuário")
    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioRM> atualizar(@RequestBody UsuarioInput usuarioInput) {
        Usuario user = cadastroUsuarioService.salvar(toDomainObject(usuarioInput));
        return new ResponseEntity<UsuarioRM>(toModel(user), HttpStatus.OK);
    }

    @ApiOperation("Deleta um usuário")
    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idUsuario) {
        cadastroUsuarioService.deletar(idUsuario);
        return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
    }

    @ApiOperation("Busca um usuário por ID")
    @GetMapping(value = "/{idUsuario}", produces = "application/json")
    public ResponseEntity<UsuarioRM> buscar(@PathVariable(value = "idUsuario") Long idUsuario) {
        Usuario user = cadastroUsuarioService.buscar(idUsuario);
        UsuarioRM userRM = toModel(user);
        return new ResponseEntity<UsuarioRM>(userRM, HttpStatus.OK);
    }

    @ApiOperation("Busca usuários por nome")
    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<UsuarioRM>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<Usuario> users = cadastroUsuarioService.buscarPorNome(nome);
        List<UsuarioRM> usersRM = toCollectionModel(users);
        return new ResponseEntity<List<UsuarioRM>>(usersRM, HttpStatus.OK);
    }

    private UsuarioRM toModel(Usuario user) {
        UsuarioRM userRM = new UsuarioRM();
        userRM.setId(user.getId());
        userRM.setLogin(user.getLogin());
        userRM.setNome(user.getNome());
        for (int i=0; i<user.getTelefones().size(); i++){
            TelefoneRM telRM = new TelefoneRM();
            telRM.setId(user.getTelefones().get(i).getId());
            telRM.setNumero(user.getTelefones().get(i).getNumero());
            telRM.setTipo(user.getTelefones().get(i).getTipo());
            userRM.getTelefones().add(telRM);
        }
        return userRM;
    }

    private List<UsuarioRM> toCollectionModel(List<Usuario> usuariosModels) {
        return usuariosModels.stream().map(usuarioModel -> toModel(usuarioModel)).collect(Collectors.toList());
    }

    private Usuario toDomainObject(UsuarioInput usuarioInput){
        Usuario user = new Usuario();
        user.setId(usuarioInput.getId());
        user.setNome(usuarioInput.getNome());
        user.setLogin(usuarioInput.getLogin());
        user.setSenha(usuarioInput.getSenha());
        for (int i=0; i<usuarioInput.getTelefones().size(); i++){
            Telefone tel = new Telefone();
            tel.setId(user.getTelefones().get(i).getId());
            tel.setNumero(user.getTelefones().get(i).getNumero());
            tel.setTipo(user.getTelefones().get(i).getTipo());
            user.getTelefones().add(tel);
        }
        return user;
    }
}
