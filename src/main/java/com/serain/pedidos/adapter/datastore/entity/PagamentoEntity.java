package com.serain.pedidos.adapter.datastore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PagamentoEntity implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    private Integer id;
    private Integer estado;

    @OneToOne
    @JoinColumn(name="pedido_id")
    @MapsId
    @JsonIgnore
    private PedidoEntity pedido;
}
