package com.serain.pedidos.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Endereco implements Serializable {
    private static final long serialVersion = 1L;

    private Integer id;
    private String lougradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cliente cliente;
    private Cidade cidade;

    public Endereco(Integer id, String lougradouro, String numero, String complemento, String bairro, String cep) {
        this.id = id;
        this.lougradouro = lougradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }
}
