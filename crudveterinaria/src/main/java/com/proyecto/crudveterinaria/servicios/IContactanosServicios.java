package com.proyecto.crudveterinaria.servicios;

import com.proyecto.crudveterinaria.modelo.Contactanos;

import java.util.List;

public interface IContactanosServicios {
    List<Contactanos> ListadoContactanos();
    Contactanos BuscarContactanos(int id);
    Contactanos CrearContactanos(Contactanos entity);
    public void EliminarContactanos(Integer id);
}

