package apiCrudPessoa.controllers;

import apiCrudPessoa.dto.UsuarioRM;
import apiCrudPessoa.input.UsuarioInput;
import apiCrudPessoa.models.Pessoa;
import apiCrudPessoa.models.UsuarioModel;
import apiCrudPessoa.repositories.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    @PostMapping(value = "/", produces = "application/json")
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @GetMapping(value = "/{idPessoa}", produces = "application/json")
    public Pessoa buscar(@PathVariable(value = "idPessoa") Long idPessoa) {
       return pessoaRepository.findById(idPessoa).get();
    }
}
