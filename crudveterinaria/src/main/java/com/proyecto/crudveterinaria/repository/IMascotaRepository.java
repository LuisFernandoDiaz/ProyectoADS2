package com.proyecto.crudveterinaria.repository;

import com.proyecto.crudveterinaria.modelo.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {
}
