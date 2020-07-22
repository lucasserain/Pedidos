package com.serain.pedidos.core.service;


import com.serain.pedidos.adapter.datastore.entity.ClienteEntity;
import com.serain.pedidos.adapter.datastore.mapper.ClienteMapper;
import com.serain.pedidos.adapter.datastore.repository.ClienteRepository;
import com.serain.pedidos.core.model.Cliente;
import com.serain.pedidos.core.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente find(Integer id){
        
        return ClienteMapper.INSTANCE.clienteEntityToCliente(clienteRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName())
        ));
    }

    public void create(Cliente cliente) {
        cliente.setId(null);

        clienteRepository.save(ClienteMapper.INSTANCE.clienteToClienteEntity(cliente));
    }

    public void update(Integer id, Cliente cliente) {
        ClienteEntity clienteEntity  = ClienteMapper.INSTANCE.clienteToClienteEntity(find(id));
        ClienteMapper.INSTANCE.updateClienteFromEntity(cliente, clienteEntity);
        clienteRepository.save(clienteEntity);
    }

    public void delete(Integer id) {
        clienteRepository.delete(ClienteMapper.INSTANCE.clienteToClienteEntity(find(id)));
    }

    public List<Cliente> findAll() {
        return ClienteMapper.INSTANCE.clienteEntityListToClienteList(clienteRepository.findAll());
    }

    public Page<Cliente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<Cliente> jooj = clienteRepository.findAll(pageRequest).map(ClienteMapper.INSTANCE::clienteEntityToCliente);
        return jooj;
    }
}
