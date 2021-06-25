package com.sda.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sda.demo.Modelo.Catalogo;

@Repository
public interface catalogoRepository extends JpaRepository<Catalogo, Integer> {

}
