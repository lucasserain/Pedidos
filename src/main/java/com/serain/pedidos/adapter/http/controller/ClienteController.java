package com.serain.pedidos.adapter.http.controller;

import com.serain.pedidos.core.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {

    @Autowired
    ClienteService ClienteService;

/*    @GetMapping(value="/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id){

       Cliente obj = ClienteService.find(id);
        return ResponseEntity.ok().body(obj);
    }*/
}
