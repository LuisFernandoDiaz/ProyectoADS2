package com.proyecto.crudveterinaria.servicios.impl;

import com.proyecto.crudveterinaria.modelo.Contactanos;
import com.proyecto.crudveterinaria.modelo.Mascota;
import com.proyecto.crudveterinaria.repository.IMascotaRepository;
import com.proyecto.crudveterinaria.servicios.IMascotaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServicios implements IMascotaServicios {

    IMascotaRepository _mascotaRepository;

    @Autowired
    public MascotaServicios(IMascotaRepository mascotaRepository){
        this._mascotaRepository = mascotaRepository;
    }

    @Override
    public List<Mascota> ListadoMascota() {
        return _mascotaRepository.findAll();
    }

    @Override
    public Mascota BuscarMascota(int id) {
        return _mascotaRepository.findById(id).get();
    }

    @Override
    public Mascota CrearMascota(Mascota entity) {
        Mascota contactanosCreada = _mascotaRepository.save(entity);
        return contactanosCreada;
    }

    @Override
    public Mascota ModificarMascota(int id, Mascota entity) {
        return _mascotaRepository.save(entity);
    }

    @Override
    public void EliminarMascota(Integer id) {
        _mascotaRepository.deleteById(id);
    }
}
