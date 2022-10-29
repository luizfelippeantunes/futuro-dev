package apiCrudPessoa.controllers;

import apiCrudPessoa.models.ProdutoModel;
import apiCrudPessoa.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {

    @Autowired
    // IC/CD/CDI - Injeção de dependências
    private ProdutoRepository produtoRepository;

    /**
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/pessoa/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Olá " + name + "!";
    }

    @RequestMapping(value = "/produto/{descricao}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String salvar(@PathVariable String descricao) {
        ProdutoModel produtoModel = new ProdutoModel();
        produtoModel.setDescricao(descricao);
        produtoRepository.save(produtoModel); //grava o produto no banco de dados
        return "Produto " + descricao + " cadastrado com sucesso!";
    }

    @GetMapping(value = "/listaProdutos")
    @ResponseBody
    // Retorna os dados no corpo da resposta
    public ResponseEntity<List<ProdutoModel>> listarTodosProdutos() {
        List<ProdutoModel> produtoModels = produtoRepository.findAll(); //Consulta todos os produtos no banco de dados
        return new ResponseEntity<List<ProdutoModel>>(produtoModels, HttpStatus.OK); //Retorna a lista em JSON
    }

    @PostMapping(value = "/produto/salvar") //Mapeia a URL
    @ResponseBody // Retorna os dados no corpo da resposta
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produtoModel) {
        ProdutoModel prod = produtoRepository.save(produtoModel);
        return new ResponseEntity<ProdutoModel>(prod, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/produto/deletar") //Mapeia a URL
    @ResponseBody // Retorna os dados no corpo da resposta
    public ResponseEntity<String> deletar(@RequestParam Long idProduto){
        produtoRepository.deleteById(idProduto);
        return new ResponseEntity<String>("Produto deletado com sucesso!", HttpStatus.OK);
    }
}