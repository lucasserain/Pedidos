package com.serain.pedidos.adapter.datastore.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.serain.pedidos.core.model.Pagamento;
import com.serain.pedidos.core.model.Pedido;
import com.serain.pedidos.core.model.enums.EstadoPagamento;
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

    public PagamentoComBoletoEntity(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}
