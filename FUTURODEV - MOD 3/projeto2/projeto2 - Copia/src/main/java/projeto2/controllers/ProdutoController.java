package projeto2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto2.dto.ProdutoRM;
import projeto2.input.ProdutoInput;
import projeto2.models.Produto;
import projeto2.services.ProdutoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<ProdutoRM> cadastrar(@RequestBody ProdutoInput produtoInput) {
        Produto produto = produtoService.salvar(toDomainObject(produtoInput));
        return new ResponseEntity<ProdutoRM>(toModel(produto), HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<ProdutoRM> atualizar(@RequestBody ProdutoInput produtoInput) {
        Produto produto = produtoService.salvar(toDomainObject(produtoInput));
        return new ResponseEntity<ProdutoRM>(toModel(produto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idProduto) {
        produtoService.deletar(idProduto);
        return new ResponseEntity<String>("Produto deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<ProdutoRM> buscarPorId(@RequestParam(name = "id") Long idProduto) {
        Produto produto = produtoService.buscar(idProduto);
        ProdutoRM produtoRM = toModel(produto);
        return new ResponseEntity<ProdutoRM>(produtoRM, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    public ResponseEntity<List<ProdutoRM>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<Produto> produtos = produtoService.buscarPorNome(nome);
        List<ProdutoRM> produtosRM = toCollectionModel(produtos);
        return new ResponseEntity<List<ProdutoRM>>(produtosRM, HttpStatus.OK);
    }

    @GetMapping(value = "/{idProduto}", produces = "application/json")
    public ResponseEntity<ProdutoRM> buscar(@PathVariable(value = "idProduto") Long idProduto) {
        Produto produto = produtoService.buscar(idProduto);
        ProdutoRM produtoRM = toModel(produto);
        return new ResponseEntity<ProdutoRM>(produtoRM, HttpStatus.OK);
    }

    private ProdutoRM toModel(Produto produto){
        ProdutoRM produtoRM = new ProdutoRM();
        produtoRM.setId(produto.getId());
        produtoRM.setCategoria(produto.getCategoria());
        produtoRM.setNome(produto.getNome());
        produtoRM.setValor(produto.getValor());
        produtoRM.setStatus(produto.isStatus());
        return produtoRM;
    }

    private List<ProdutoRM> toCollectionModel(List<Produto> produtos){
        return produtos.stream().map(produto -> toModel(produto)).collect(Collectors.toList());
    }

    private Produto toDomainObject(ProdutoInput produtoInput){
        Produto produto = new Produto();
        produto.setId(produtoInput.getId());
        produto.setCategoria(produtoInput.getCategoria());
        produto.setNome(produtoInput.getNome());
        produto.setValor(produtoInput.getValor());
        produto.setStatus(produtoInput.isStatus());
        return produto;
    }

}
