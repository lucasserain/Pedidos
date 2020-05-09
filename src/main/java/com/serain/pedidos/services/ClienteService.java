package com.serain.pedidos.services;

import com.serain.pedidos.domain.Cliente;
import com.serain.pedidos.repository.ClienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

    public Cliente find(Integer id){
        Optional<Cliente> obj = ClienteRepository.findById(id);
       return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(),""));
    }
}
