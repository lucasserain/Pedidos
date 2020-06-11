package com.serain.pedidos.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Entity
public class Produto implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @JsonBackReference
    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA",
        joinColumns = @JoinColumn(name="produto_id"),
        inverseJoinColumns = @JoinColumn(name="categoria_id")
    )
    private List<Categoria> categorias = new ArrayList<>();

    @OneToMany(mappedBy = "id.produto")
    private Set<ItemPedido> itens = new HashSet<>();

    private List<Pedido> getPedidos(){
        List<Pedido> lista = new ArrayList<>();
        for (ItemPedido itemPedido: itens) {
            lista.add(itemPedido.getPedido());
        }
        return lista;
    }

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
