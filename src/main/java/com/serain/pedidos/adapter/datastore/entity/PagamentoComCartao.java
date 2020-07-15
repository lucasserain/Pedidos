package com.serain.pedidos.adapter.datastore.entity;

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
}
