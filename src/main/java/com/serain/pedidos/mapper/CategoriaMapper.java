package com.serain.pedidos.mapper;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.adapter.datastore.entity.CategoriaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoriaMapper {

    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaEntity categoriaToCategoriaEntity(Categoria categoria);

    Categoria categoriaEntityToCategoria(CategoriaEntity categoriaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void updateCategoriaFromEntity(Categoria dto, @MappingTarget CategoriaEntity entity);


}
