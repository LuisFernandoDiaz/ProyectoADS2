package com.proyecto.crudveterinaria.apis;

import com.proyecto.crudveterinaria.modelo.Mascota;
import com.proyecto.crudveterinaria.modelo.Servicio;
import com.proyecto.crudveterinaria.servicios.IServicioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    IServicioServicios _servicioServicios;

    @Autowired
    public ServicioController(IServicioServicios servicioServicios){
        this._servicioServicios = servicioServicios;
    }

    @CrossOrigin("*")
    @GetMapping("/listadoServis")
    public List<Servicio> listaDeServicio(){
        return _servicioServicios.ListadoServicio();
    }

    @CrossOrigin("*")
    @GetMapping("/buscarServis/{id}")
    public Servicio busquedaDeServicio(@PathVariable int id){
        return _servicioServicios.BuscarServicio(id);
    }

    @CrossOrigin("*")
    @PostMapping("/crearServis")
    public Servicio crearServicio(@RequestBody Servicio entity){
        return _servicioServicios.CrearServicio(entity);
    }

    @CrossOrigin("*")
    @PutMapping("/modificarServis/{id}")
    public Servicio modificarServicio(@PathVariable int id, @RequestBody Servicio entity){
        return _servicioServicios.ModificarServicio(id,entity);
    }

    @CrossOrigin("*")
    @DeleteMapping("/eliminarServis/{id}")
    public void eliminarServicio(@PathVariable Integer id){
        _servicioServicios.EliminarServicio(id);
    }


}
