package com.serain.pedidos.core.service;


import com.serain.pedidos.adapter.datastore.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

//    public Cliente find(Integer id){
//        Optional<Cliente> obj = ClienteRepository.findById(id);
//       return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(),""));
//    }
}
