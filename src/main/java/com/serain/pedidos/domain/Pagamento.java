package com.serain.pedidos.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serain.pedidos.domain.enums.EstadoPagamento;
import com.serain.pedidos.domain.enums.TipoCliente;
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
public abstract class Pagamento implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    private Integer id;
    private Integer estado;

    @OneToOne
    @JoinColumn(name="pedido_id")
    @MapsId
    @JsonIgnore
    private Pedido pedido;

    public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
        this.id = id;
        this.estado = estado.getCod();
        this.pedido= pedido;
    }

    public EstadoPagamento getEstado() {
        return EstadoPagamento.toEnum(estado);
    }

    public void setEstado(EstadoPagamento estado) {
        this.estado = estado.getCod();
    }


}
