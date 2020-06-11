package com.serain.pedidos.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.serain.pedidos.domain.enums.EstadoPagamento;
import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComBoleto extends Pagamento {
    private static final long serialVersion = 1L;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataPagamento;

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}
