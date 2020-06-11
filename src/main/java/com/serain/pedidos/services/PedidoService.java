package com.serain.pedidos.services;

import com.serain.pedidos.domain.Pedido;
import com.serain.pedidos.repository.PedidoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository PedidoRepository;

    public Pedido find(Integer id){
        Optional<Pedido> obj = PedidoRepository.findById(id);
       return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(),""));
    }
}
