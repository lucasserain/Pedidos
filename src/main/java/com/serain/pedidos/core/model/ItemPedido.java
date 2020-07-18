package com.serain.pedidos.core.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ItemPedido implements Serializable {
    private static final long serialVersionUID = 1L;

    //TODO possivelmente vai dar merda com essa geracao de pk
/*    @JsonIgnore
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();*/

    private Double desconto;
    private Integer quantidade;
    private Double preco;
}
