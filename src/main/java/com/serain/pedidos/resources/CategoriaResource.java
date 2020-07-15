package com.serain.pedidos.resources;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value="/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id){

        Categoria obj = categoriaService.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody Categoria categoria){

        categoriaService.create(categoria);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PatchMapping(value="/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id,
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
