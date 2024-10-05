package com.proyecto.crudveterinaria.servicios;

import com.proyecto.crudveterinaria.modelo.Contactanos;
import com.proyecto.crudveterinaria.modelo.Mascota;

import java.util.List;

public interface IMascotaServicios {

    List<Mascota> ListadoMascota();
    Mascota BuscarMascota(int id);
    Mascota CrearMascota(Mascota entity);
    Mascota ModificarMascota(int id, Mascota entity);
    public void EliminarMascota(Integer id);
}
