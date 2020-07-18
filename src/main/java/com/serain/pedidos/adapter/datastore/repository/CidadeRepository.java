package com.serain.pedidos.adapter.datastore.repository;

import com.serain.pedidos.adapter.datastore.entity.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeEntity, Integer> {

}
