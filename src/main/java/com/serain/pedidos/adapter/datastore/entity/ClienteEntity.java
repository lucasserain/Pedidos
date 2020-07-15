package com.serain.pedidos.adapter.datastore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serain.pedidos.core.model.Endereco;
import com.serain.pedidos.core.model.Pedido;
import com.serain.pedidos.core.model.enums.TipoCliente;
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

    @ElementCollection //nome da tabela auxiliar
    @CollectionTable(name="TELEFONE")
    private Set<String> telefones = new HashSet<>();  //Set n permite repeticção

    public ClienteEntity(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();

    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }
}
