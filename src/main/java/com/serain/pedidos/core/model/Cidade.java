package com.serain.pedidos.core.model;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Estado estado;
}
