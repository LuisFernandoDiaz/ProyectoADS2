package com.proyecto.crudveterinaria.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contactanos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id ;
    public String nombre;
    public String gmail;
    public String numTelefono;
    public String mensaje;
}
