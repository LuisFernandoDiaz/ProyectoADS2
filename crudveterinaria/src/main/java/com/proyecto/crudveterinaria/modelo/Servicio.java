package com.proyecto.crudveterinaria.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String nomMascota;
    public boolean acupuntura;
    public boolean anestesia;
    public boolean cardiologia;
    public boolean cirugiaEspecializada;
    public boolean cirugiaGeneral;
    public boolean endocrinologia;
    public boolean nutricionClinica;
    public boolean odontologia;
    public boolean oftalmologia;

}
