package apiCrudPessoa.controllers;

import apiCrudPessoa.models.Pessoa;

import apiCrudPessoa.repositories.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<Pessoa> cadastrar(@RequestBody Pessoa pessoa) {
        Pessoa novo = pessoaRepository.save(pessoa);
        return new ResponseEntity<Pessoa>(novo, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{idPessoa}", produces = "application/json")
    public ResponseEntity<Pessoa> buscar(@PathVariable(value = "idPessoa") Long idPessoa) {
        Pessoa encontrada = pessoaRepository.findById(idPessoa).get();
        return new ResponseEntity<Pessoa>(encontrada, HttpStatus.OK);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
        Pessoa atualizada = pessoaRepository.save(pessoa);
        return new ResponseEntity<Pessoa>(atualizada, HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idUsuario) {
        pessoaRepository.deleteById(idUsuario);
        return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Pessoa>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<Pessoa> pessoas = pessoaRepository.buscarPorNome(nome);
        return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
    }
}
