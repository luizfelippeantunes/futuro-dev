package br.futurodev.primeiraapi.controllers;

import br.futurodev.primeiraapi.dto.UsuarioRM;
import br.futurodev.primeiraapi.models.UsuarioModel;
import br.futurodev.primeiraapi.services.CadastroUsuarioService;
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
    public ResponseEntity<UsuarioRM> cadastrar(@RequestBody UsuarioModel usuarioModel) {
        UsuarioModel user = cadastroUsuarioService.salvar(usuarioModel);
        return new ResponseEntity<UsuarioRM>(toModel(user), HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioRM> atualizar(@RequestBody UsuarioModel usuarioModel) {
        UsuarioModel user = cadastroUsuarioService.salvar(usuarioModel);
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
        return userRM;
    }

    private List<UsuarioRM> toCollectionModel(List<UsuarioModel> usuariosModels) {
        return usuariosModels.stream().map(usuarioModel -> toModel(usuarioModel)).collect(Collectors.toList());
    }
}
