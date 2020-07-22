package com.serain.pedidos.adapter.http.controller;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.core.model.Cliente;
import com.serain.pedidos.core.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value="/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id){

        Cliente obj = clienteService.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> clientes = clienteService.findAll();

        return  ResponseEntity.ok().body(clientes);
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<Cliente>> findPage(
            @RequestParam(value="page", defaultValue = "0") Integer page,
            @RequestParam(value="linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue = "nome")String orderBy,
            @RequestParam(value="direction", defaultValue = "ASC")String direction){

        Page<Cliente> Clientes = clienteService.findPage(page,linesPerPage,orderBy,direction);

        return  ResponseEntity.ok().body(Clientes);
    }

    @PostMapping
    public ResponseEntity<?> insert(@Valid @RequestBody Cliente cliente){

        clienteService.create(cliente);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PatchMapping(value="/{id}")
    public ResponseEntity<?> update(@Valid @PathVariable Integer id,
                                    @RequestBody Cliente cliente){
        clienteService.update(id, cliente);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){

        clienteService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
