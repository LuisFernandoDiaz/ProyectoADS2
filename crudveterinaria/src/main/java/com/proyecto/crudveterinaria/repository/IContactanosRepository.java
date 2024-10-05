package com.proyecto.crudveterinaria.repository;

import com.proyecto.crudveterinaria.modelo.Contactanos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactanosRepository extends JpaRepository<Contactanos, Integer> {
}
