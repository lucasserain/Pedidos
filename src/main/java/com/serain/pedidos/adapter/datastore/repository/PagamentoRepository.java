package com.serain.pedidos.adapter.datastore.repository;

import com.serain.pedidos.adapter.datastore.entity.PagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoEntity, Integer> {
    // Um objeto desse tipo é capaz de buscar,salvar,alterar, ou seja acessar objetos de Categoria.

}
