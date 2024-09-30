package com.proyecto.crudveterinaria.servicios;

import com.proyecto.crudveterinaria.modelo.Cliente;

import java.util.List;

public interface IClienteServicios {
    List<Cliente> ListadoCliente();
    Cliente BuscarCliente(int id);
    Cliente CrearCliente(Cliente entity);
    Cliente ModificarCliente(int id, Cliente entity);
    public void EliminarCliente(Integer id);
}
