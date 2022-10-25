package br.com.futurodev.agenda.controllers;

import br.com.futurodev.agenda.models.Contato;
import br.com.futurodev.agenda.repositories.ContatoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contato")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoReporitory;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<Contato> cadastrar(@RequestBody Contato contato) {
        Contato cont = contatoReporitory.save(contato);
        return new ResponseEntity<Contato>(cont, HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<Contato> atualizar(@RequestBody Contato contato) {
        Contato cont = contatoReporitory.save(contato);
        return new ResponseEntity<Contato>(cont, HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idContato) {
        contatoReporitory.deleteById(idContato);
        return new ResponseEntity<String>("Contato deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/{idContato}")
    public ResponseEntity<Contato> buscar(@PathVariable(value = "idContato") Long idContato) {
        Contato cont = contatoReporitory.findById(idContato).get();
        return new ResponseEntity<Contato>(cont, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    public ResponseEntity<List<Contato>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<Contato> contatos = contatoReporitory.buscarContatoNome(nome);
        return new ResponseEntity<List<Contato>>(contatos, HttpStatus.OK);
    }

}
