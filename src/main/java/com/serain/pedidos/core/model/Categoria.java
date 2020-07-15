package com.serain.pedidos.core.model;

import com.serain.pedidos.domain.Produto;
import lombok.*;

import javax.persistence.*;
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
