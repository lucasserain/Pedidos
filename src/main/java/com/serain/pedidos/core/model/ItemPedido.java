package com.serain.pedidos.core.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serain.pedidos.adapter.datastore.entity.ItemPedidoPK;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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

    public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer quantidade, Double preco) {
        id.setProduto(produto);
        id.setPedido(pedido);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @JsonIgnore
    public Pedido getPedido(){
        return id.getPedido();
    }

    public Produto getProduto(){
        return id.getProduto();
    }
}
