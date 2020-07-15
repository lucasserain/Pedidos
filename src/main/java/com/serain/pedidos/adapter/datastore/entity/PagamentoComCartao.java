package com.serain.pedidos.adapter.datastore.entity;

import com.serain.pedidos.core.model.Pagamento;
import com.serain.pedidos.core.model.Pedido;
import com.serain.pedidos.core.model.enums.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComCartao extends PagamentoEntity {
    private static final long serialVersion = 1L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
