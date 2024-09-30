package com.proyecto.crudveterinaria.servicios.impl;

import com.proyecto.crudveterinaria.modelo.Cliente;
import com.proyecto.crudveterinaria.repository.IClienteRepository;
import com.proyecto.crudveterinaria.servicios.IClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicios implements IClienteServicios {

    IClienteRepository _ClienteRepository;

    @Autowired
    public ClienteServicios (IClienteRepository clienteRepository){
        this._ClienteRepository = clienteRepository;
    }



    @Override
    public List<Cliente> ListadoCliente() {
        return _ClienteRepository.findAll();
    }

    @Override
    public Cliente BuscarCliente(int id) {
        return _ClienteRepository.findById(id).get();
    }

    @Override
    public Cliente CrearCliente(Cliente entity) {
        Cliente crearCliente = _ClienteRepository.save(entity);
        return crearCliente;
    }

    @Override
    public Cliente ModificarCliente(int id, Cliente entity) {
        return _ClienteRepository.save(entity);
    }

    @Override
    public void EliminarCliente(Integer id) {
        _ClienteRepository.deleteById(id);
    }
}
