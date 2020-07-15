package com.serain.pedidos.core.service;

import com.serain.pedidos.adapter.datastore.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository PedidoRepository;

/*    public Pedido find(Integer id){
        Optional<Pedido> obj = PedidoRepository.findById(id);
       return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(),""));
    }*/
}
