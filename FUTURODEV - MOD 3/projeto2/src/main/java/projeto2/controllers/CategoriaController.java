package projeto2.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto2.dto.CategoriaRM;
import projeto2.input.CategoriaInput;
import projeto2.models.Categoria;
import projeto2.services.CategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = "Categorias")
@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @ApiOperation("Listar todas as categorias cadastradas")
    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<CategoriaRM>> listarCategorias() {
        List<Categoria> categorias = categoriaService.ListarCategorias();
        List<CategoriaRM> categoriasRM = toCollectionModel(categorias);
        return new ResponseEntity<List<CategoriaRM>>(categoriasRM, HttpStatus.OK);
    }

    @ApiOperation("Salvar uma categoria")
    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<CategoriaRM> cadastrar(@RequestBody CategoriaInput categoriaInput) {
        Categoria categoria = categoriaService.salvar(toDomainObject(categoriaInput));
        return new ResponseEntity<CategoriaRM>(toModel(categoria), HttpStatus.CREATED);
    }

    @ApiOperation("Atualizar uma categoria")
    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<CategoriaRM> atualizar(@RequestBody CategoriaInput categoriaInput) {
        Categoria categoria = categoriaService.salvar(toDomainObject(categoriaInput));
        return new ResponseEntity<CategoriaRM>(toModel(categoria), HttpStatus.OK);
    }

    @ApiOperation("Deletar uma categoria")
    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idCategoria) {
        categoriaService.deletar(idCategoria);
        return new ResponseEntity<String>("Categoria deletada com sucesso!", HttpStatus.OK);
    }

    @ApiOperation("Buscar uma categoria por ID como parâmetro")
    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<CategoriaRM> buscarPorId(@RequestParam(name = "id") Long idCategoria) {
        Categoria categoria = categoriaService.buscar(idCategoria);
        CategoriaRM categoriaRM = toModel(categoria);
        return new ResponseEntity<CategoriaRM>(categoriaRM, HttpStatus.OK);
    }

    @ApiOperation("Buscar uma categoria por descrição")
    @GetMapping(value = "/buscarPorDescricao", produces = "application/json")
    public ResponseEntity<List<CategoriaRM>> buscarPorDescricao(@RequestParam(name = "descricao") String descricao) {
        List<Categoria> categorias = categoriaService.buscarPorDescricao(descricao);
        List<CategoriaRM> categoriasRM = toCollectionModel(categorias);
        return new ResponseEntity<List<CategoriaRM>>(categoriasRM, HttpStatus.OK);
    }

    @ApiOperation("Buscar uma categoria por ID pela URL")
    @GetMapping(value = "/{idCategoria}", produces = "application/json")
    public ResponseEntity<CategoriaRM> buscar(@PathVariable(value = "idCategoria") Long idCategoria) {
        Categoria categoria = categoriaService.buscar(idCategoria);
        CategoriaRM categoriaRM = toModel(categoria);
        return new ResponseEntity<CategoriaRM>(categoriaRM, HttpStatus.OK);
    }

    private CategoriaRM toModel(Categoria categoria){
        CategoriaRM categoriaRM = new CategoriaRM();
        categoriaRM.setId(categoria.getId());
        categoriaRM.setNome(categoria.getNome());
        categoriaRM.setDescricao(categoria.getDescricao());
        return categoriaRM;
    }

    private List<CategoriaRM> toCollectionModel(List<Categoria> categorias){
        return categorias.stream().map(categoria -> toModel(categoria)).collect(Collectors.toList());
    }

    private Categoria toDomainObject(CategoriaInput categoriaInput){
        Categoria categoria = new Categoria();
        categoria.setId(categoriaInput.getId());
        categoria.setNome(categoriaInput.getNome());
        categoria.setDescricao(categoriaInput.getDescricao());
        return categoria;
    }

}
