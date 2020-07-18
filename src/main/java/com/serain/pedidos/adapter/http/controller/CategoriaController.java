package com.serain.pedidos.adapter.http.controller;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.core.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;


    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> categorias = categoriaService.findAll();

        return  ResponseEntity.ok().body(categorias);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id){

        Categoria obj = categoriaService.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<Categoria>> findPage(
            @RequestParam(value="page", defaultValue = "0") Integer page,
            @RequestParam(value="linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue = "nome")String orderBy,
            @RequestParam(value="direction", defaultValue = "ASC")String direction){

        Page<Categoria> categorias = categoriaService.findPage(page,linesPerPage,orderBy,direction);

        return  ResponseEntity.ok().body(categorias);
    }

    @PostMapping
    public ResponseEntity<?> insert(@Valid @RequestBody Categoria categoria){

        categoriaService.create(categoria);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PatchMapping(value="/{id}")
    public ResponseEntity<?> update(@Valid @PathVariable Integer id,
                                    @RequestBody Categoria categoria){
        categoriaService.update(id, categoria);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){

        categoriaService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
