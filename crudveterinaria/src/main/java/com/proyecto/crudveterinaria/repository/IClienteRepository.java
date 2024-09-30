package com.proyecto.crudveterinaria.repository;

import com.proyecto.crudveterinaria.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository  extends JpaRepository<Cliente, Integer> {
}
