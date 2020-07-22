package com.serain.pedidos.adapter.datastore.mapper;

import com.serain.pedidos.adapter.datastore.entity.ClienteEntity;
import com.serain.pedidos.core.model.Cliente;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    @Mapping(source = "tipo", target = "tipo")
    ClienteEntity clienteToClienteEntity(Cliente cliente);

    Cliente clienteEntityToCliente(ClienteEntity clienteEntity);

    List<Cliente>  clienteEntityListToClienteList(List<ClienteEntity> clienteEntityList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void updateClienteFromEntity(Cliente dto, @MappingTarget ClienteEntity entity);

}
