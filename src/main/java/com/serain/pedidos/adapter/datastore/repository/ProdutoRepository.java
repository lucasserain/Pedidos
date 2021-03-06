package com.serain.pedidos.adapter.datastore.repository;


import com.serain.pedidos.adapter.datastore.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {

}
