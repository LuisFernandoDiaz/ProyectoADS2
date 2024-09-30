package com.proyecto.crudveterinaria.servicios.impl;


import com.proyecto.crudveterinaria.modelo.Servicio;
import com.proyecto.crudveterinaria.repository.IServicioRepository;
import com.proyecto.crudveterinaria.servicios.IServicioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServicios implements IServicioServicios {

    IServicioRepository _servicioRepository;

    @Autowired
    public ServicioServicios(IServicioRepository servicioRepository){
        this._servicioRepository = servicioRepository;
    }


    @Override
    public List<Servicio> ListadoServicio() {
        return _servicioRepository.findAll();
    }

    @Override
    public Servicio BuscarServicio(int id) {
        return _servicioRepository.findById(id).get();
    }

    @Override
    public Servicio CrearServicio(Servicio entity) {
        Servicio crearServicio = _servicioRepository.save(entity);
        return crearServicio;
    }

    @Override
    public Servicio ModificarServicio(int id, Servicio entity) {
        return _servicioRepository.save(entity);
    }

    @Override
    public void EliminarServicio(Integer id) {
        _servicioRepository.deleteById(id);
    }
}
