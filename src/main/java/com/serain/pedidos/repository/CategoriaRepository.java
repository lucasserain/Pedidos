package com.serain.pedidos.repository;

import com.serain.pedidos.domain.Categoria;
import com.serain.pedidos.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
    // Um objeto desse tipo é capaz de buscar,salvar,alterar, ou seja acessar objetos de Categoria.

}
