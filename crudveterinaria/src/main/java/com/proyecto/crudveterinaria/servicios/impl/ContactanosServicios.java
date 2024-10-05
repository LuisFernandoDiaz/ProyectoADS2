package com.proyecto.crudveterinaria.servicios.impl;

import com.proyecto.crudveterinaria.modelo.Contactanos;
import com.proyecto.crudveterinaria.repository.IContactanosRepository;
import com.proyecto.crudveterinaria.servicios.IContactanosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactanosServicios implements IContactanosServicios {

    IContactanosRepository _iContactanosRepository;

    @Autowired
    public ContactanosServicios(IContactanosRepository iContactanosRepository){
        this._iContactanosRepository = iContactanosRepository;
    }


    @Override
    public List<Contactanos> ListadoContactanos() {
        return _iContactanosRepository.findAll();
    }

    @Override
    public Contactanos BuscarContactanos(int id) {
        return _iContactanosRepository.findById(id).get();

    }

    @Override
    public Contactanos CrearContactanos(Contactanos entity) {
        Contactanos creado = _iContactanosRepository.save(entity);
        return creado;
    }

    @Override
    public void EliminarContactanos(Integer id) {
        _iContactanosRepository.deleteById(id);
    }
}
