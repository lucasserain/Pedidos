package com.serain.pedidos.core.model;

import com.serain.pedidos.core.model.enums.TipoCliente;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Cliente implements Serializable {
    private static final long serialVersion = 1L;

    private Integer id;
    @NotEmpty(message="Preenchimento obrigatório")
    @Length(min=5, max=80, message = "O tamanho deve ser entre 5 e 80 caracteres ")
    private String nome;
    @NotEmpty(message="Preenchimento obrigatório")
    @Email(message = "Email inválido")
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();
    private Set<String> telefones = new HashSet<>();

    public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
    }

/*    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }*/
}
