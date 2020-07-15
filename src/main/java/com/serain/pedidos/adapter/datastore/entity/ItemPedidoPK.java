package com.serain.pedidos.adapter.datastore.entity;

import com.serain.pedidos.core.model.Pedido;
import com.serain.pedidos.core.model.Produto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter@Setter
@EqualsAndHashCode
@Embeddable
public class ItemPedidoPK implements Serializable {
    private static final long serialVersion = 1L;

    @ManyToOne
    @JoinColumn(name="pedido_id")
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name="produto_id")
    private ProdutoEntity produto;
}
