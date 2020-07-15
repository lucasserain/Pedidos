package com.serain.pedidos.repository;

import com.serain.pedidos.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    // Um objeto desse tipo é capaz de buscar,salvar,alterar, ou seja acessar objetos de Categoria.

}
