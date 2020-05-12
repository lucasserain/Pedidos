package com.serain.pedidos.domain;

import com.serain.pedidos.domain.enums.EstadoPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComCartao extends Pagamento {
    private static final long serialVersion = 1L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
