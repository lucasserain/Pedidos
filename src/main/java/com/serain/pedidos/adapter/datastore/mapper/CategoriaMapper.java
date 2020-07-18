package com.serain.pedidos.adapter.datastore.mapper;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.adapter.datastore.entity.CategoriaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaMapper {

    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaEntity categoriaToCategoriaEntity(Categoria categoria);

    Categoria categoriaEntityToCategoria(CategoriaEntity categoriaEntity);

    List<Categoria>  categoriaEntityListToCategoriaList(List<CategoriaEntity> categoriaEntityList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void updateCategoriaFromEntity(Categoria dto, @MappingTarget CategoriaEntity entity);

}
