package com.proyecto.crudveterinaria.servicios;

import com.proyecto.crudveterinaria.modelo.Servicio;

import java.util.List;

public interface IServicioServicios {
    List<Servicio> ListadoServicio();
    Servicio BuscarServicio(int id);
    Servicio CrearServicio(Servicio entity);
    Servicio ModificarServicio(int id, Servicio entity);
    public void EliminarServicio(Integer id);
}
