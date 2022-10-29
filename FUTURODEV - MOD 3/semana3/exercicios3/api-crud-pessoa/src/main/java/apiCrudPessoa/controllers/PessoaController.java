package apiCrudPessoa.controllers;

import apiCrudPessoa.dto.UsuarioRM;
import apiCrudPessoa.input.UsuarioInput;
import apiCrudPessoa.models.UsuarioModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    /*@PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<UsuarioRM> cadastrar(@RequestBody UsuarioInput usuarioInput) {
        UsuarioModel user = cadastroUsuarioService.salvar(toDomainObject(usuarioInput));
        return new ResponseEntity<UsuarioRM>(toModel(user), HttpStatus.CREATED);
    }*/

}
