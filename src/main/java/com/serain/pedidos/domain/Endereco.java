package com.serain.pedidos.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco implements Serializable {
    private static final long serialVersion = 1L;

    private Integer id;
    private String lougradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cidade cidade;
    

}
