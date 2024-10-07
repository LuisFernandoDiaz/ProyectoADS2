package com.proyecto.crudveterinaria.modelo;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id ;
    public String nombre;
    public String apellido;
    public String dni;
    public String numero;
    public String correo;
    public String direccion;
    public String username;
    public String password;
}
