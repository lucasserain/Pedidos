package com.serain.pedidos.adapter.datastore.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class PedidoEntity implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date instante;

    @OneToOne(cascade =CascadeType.ALL, mappedBy = "pedido")
    private PagamentoEntity pagamento;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "endereco_de_entrega_id")
    private EnderecoEntity enderecoDeEntrega;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedidoEntity> itens = new HashSet<>();

}
