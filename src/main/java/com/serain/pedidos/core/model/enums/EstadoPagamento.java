package com.serain.pedidos.core.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(2, "Cancelado");

    private int cod;
    private String descricao;

    public static EstadoPagamento toEnum(Integer cod){
        if(cod==null)
            return null;

        for (EstadoPagamento estadoPagamento: EstadoPagamento.values()) {
            if(cod.equals(estadoPagamento.getCod())){
                return estadoPagamento;
            }
            
        }

        throw new IllegalArgumentException("Id Inválido:" + cod);
    }

}
