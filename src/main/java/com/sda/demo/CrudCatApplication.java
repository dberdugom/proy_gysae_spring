package com.sda.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sda.demo.Modelo.Catalogo;
import com.sda.demo.repository.catalogoRepository;

@SpringBootApplication
public class CrudCatApplication implements CommandLineRunner {

	@Autowired
	private catalogoRepository catalogoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudCatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Catalogo> catalogo = catalogoRepository.findAll();
			
		catalogo.forEach(System.out::println);

	}

}