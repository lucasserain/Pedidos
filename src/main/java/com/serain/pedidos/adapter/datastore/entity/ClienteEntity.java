package com.serain.pedidos.adapter.datastore.entity;

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

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ClienteEntity implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<PedidoEntity> pedidos = new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    private List<EnderecoEntity> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="TELEFONE")
    private Set<String> telefones = new HashSet<>();
}
