package com.serain.pedidos.core.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int cod;
    private String descricao;

    public static TipoCliente toEnum(Integer cod){
        if(cod==null)
            return null;

        for (TipoCliente tipoCliente: TipoCliente.values()) {
            if(cod.equals(tipoCliente.getCod())){
                return tipoCliente;
            }
            
        }

        throw new IllegalArgumentException("Id Inválido:" + cod);
    }

}
