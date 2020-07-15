package com.serain.pedidos.adapter.datastore.repository;

import com.serain.pedidos.domain.Pagamento;
import com.serain.pedidos.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    // Um objeto desse tipo é capaz de buscar,salvar,alterar, ou seja acessar objetos de Categoria.

}
