package com.serain.pedidos;

import com.serain.pedidos.adapter.datastore.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosApplication{

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

}
