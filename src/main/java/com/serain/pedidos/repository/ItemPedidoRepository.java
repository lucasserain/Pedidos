package com.serain.pedidos.repository;

import com.serain.pedidos.domain.Categoria;
import com.serain.pedidos.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
    // Um objeto desse tipo é capaz de buscar,salvar,alterar, ou seja acessar objetos de Categoria.

}
