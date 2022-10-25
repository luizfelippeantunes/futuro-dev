package br.futurodev.primeiraapi.controllers;

import br.futurodev.primeiraapi.models.Usuario;
import br.futurodev.primeiraapi.services.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private CadastroUsuarioService cadastroUsuarioService;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {
        Usuario user = cadastroUsuarioService.salvar(usuario);
        return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario) {
        Usuario user = cadastroUsuarioService.salvar(usuario);
        return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idUsuario) {
        cadastroUsuarioService.deletar(idUsuario);
        return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/{idUsuario}", produces = "application/json")
    public ResponseEntity<Usuario> buscar(@PathVariable(value = "idUsuario") Long idUsuario) {
        Usuario user = cadastroUsuarioService.buscar(idUsuario);
        return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Usuario>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<Usuario> usuarios = cadastroUsuarioService.buscarPorNome(nome);
        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }

/*    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioModel> cadastrar(@RequestBody UsuarioModel usuario){
        UsuarioModel user = usuarioRepository.save(usuario);
        return new ResponseEntity<UsuarioModel>(user, HttpStatus.CREATED);
    }*/

}
