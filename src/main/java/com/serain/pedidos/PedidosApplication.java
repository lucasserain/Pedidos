package com.serain.pedidos;

import com.serain.pedidos.domain.Categoria;
import com.serain.pedidos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PedidosApplication implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
		System.out.println("tESTE");
	}

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null,"Informática");
        Categoria cat2 = new Categoria(null,"Escritório");

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2));


    }
}
