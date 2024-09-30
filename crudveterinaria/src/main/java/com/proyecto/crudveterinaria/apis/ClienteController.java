package com.proyecto.crudveterinaria.apis;

import com.proyecto.crudveterinaria.modelo.Cliente;
import com.proyecto.crudveterinaria.servicios.IClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

    IClienteServicios _clienteServicios;

    @Autowired
    public ClienteController(IClienteServicios clienteServicios){
        this._clienteServicios = clienteServicios;
    }

    @CrossOrigin("*")
    @GetMapping("/listadoClient")
    public List<Cliente> listaDeClientes(){
        return _clienteServicios.ListadoCliente();
    }

    @CrossOrigin("*")
    @GetMapping("/buscarClient/{id}")
    public Cliente busquedaDeClientes(@PathVariable int id){
        return _clienteServicios.BuscarCliente(id);
    }

    @CrossOrigin("*")
    @PostMapping("/crearClient")
    public Cliente crearCliente(@RequestBody Cliente entity){
        return _clienteServicios.CrearCliente(entity);
    }

    @CrossOrigin("*")
    @PutMapping("/modificarClient/{id}")
    public Cliente modificarCliente(@PathVariable int id, @RequestBody Cliente entity){
        return _clienteServicios.ModificarCliente(id,entity);
    }

    @CrossOrigin("*")
    @DeleteMapping("/eliminarClient/{id}")
    public void eliminarCliente(@PathVariable Integer id){
        _clienteServicios.EliminarCliente(id);
    }

}
