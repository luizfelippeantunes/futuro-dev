package br.futurodev.exercicios2.controllers;

import br.futurodev.exercicios2.models.ProdutoModel;
import br.futurodev.exercicios2.repositories.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {

    @Autowired
    // IC/CD/CDI - Injeção de dependências
    private produtoRepository produtoRepository;

    /**
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/pessoa/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Olá " + name + " estamos começando nosso trabalho com Spring Boot!";
    }

    @RequestMapping(value = "/media/{valor1},{valor2}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String salvar(@PathVariable String valor1, @PathVariable String valor2) {
        double media = (Double.parseDouble(valor1) + Double.parseDouble(valor2)) / 2;
        return "Valor 1 = " + valor1 + ", valor 2 = " + valor2 + ", e a média entre eles é " + media + ".";
    }

    @GetMapping(value = "/listaProdutos")
    @ResponseBody
    // Retorna os dados no corpo da resposta
    public ResponseEntity<List<ProdutoModel>> listarTodosProdutos() {
        List<ProdutoModel> produtos = produtoRepository.findAll(); //Consulta todos os produtos no banco de dados
        return new ResponseEntity<List<ProdutoModel>>(produtos, HttpStatus.OK); //Retorna a lista em JSON
    }

    @PostMapping(value = "/produto/salvar")
    //Mapeia a URL
    @ResponseBody
    // Retorna os dados no corpo da resposta
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto) {
        ProdutoModel prod = produtoRepository.save(produto);
        return new ResponseEntity<ProdutoModel>(prod, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/produto/deletar")
    //Mapeia a URL
    @ResponseBody
    // Retorna os dados no corpo da resposta
    public ResponseEntity<String> deletar(@RequestParam Long idProduto) {
        produtoRepository.deleteById(idProduto);
        return new ResponseEntity<String>("Produto deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/produto/buscar")
    @ResponseBody
    public ResponseEntity<ProdutoModel> buscar(@RequestBody Long idProduto) {
        Optional<ProdutoModel> prod = produtoRepository.findById(idProduto);
        return new ResponseEntity<ProdutoModel>(HttpStatus.OK);
    }
}