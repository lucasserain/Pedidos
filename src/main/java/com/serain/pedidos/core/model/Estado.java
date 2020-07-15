package com.serain.pedidos.core.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private List<Cidade> cidades;

    public Estado(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
