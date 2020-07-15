package com.serain.pedidos.core.model;

import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Categoria implements Serializable {
    private static final long serialVersion = 1L;

    private Integer id;
    private String nome;
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
