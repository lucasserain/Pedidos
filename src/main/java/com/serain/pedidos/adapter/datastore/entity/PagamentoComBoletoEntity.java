package com.serain.pedidos.adapter.datastore.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComBoletoEntity extends PagamentoEntity {
    private static final long serialVersion = 1L;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataPagamento;

}
