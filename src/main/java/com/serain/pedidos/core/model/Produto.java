package com.serain.pedidos.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Produto implements Serializable {
    private static final long serialVersion = 1L;

    private Integer id;
    private String nome;
    private Double preco;

    @JsonIgnore
    private List<Categoria> categorias = new ArrayList<>();

    @JsonIgnore
    private Set<ItemPedido> itens = new HashSet<>();

}
