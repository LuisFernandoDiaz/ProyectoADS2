package com.proyecto.crudveterinaria.apis;

import com.proyecto.crudveterinaria.modelo.Contactanos;
import com.proyecto.crudveterinaria.servicios.IContactanosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactanos")
public class ContactanosController {

    IContactanosServicios _iContactanosServicios;

    @Autowired
    public ContactanosController(IContactanosServicios iContactanosServicios){
        this._iContactanosServicios = iContactanosServicios;
    }

    @CrossOrigin("*")
    @GetMapping("/listadoContact")
    public List<Contactanos> listaDeContactanos(){
        return _iContactanosServicios.ListadoContactanos();
    }

    @CrossOrigin("*")
    @GetMapping("/buscarContact/{id}")
    public Contactanos busquedaDeContactanos(@PathVariable int id){
        return _iContactanosServicios.BuscarContactanos(id);
    }

    @CrossOrigin("*")
    @PostMapping("/crearContact")
    public Contactanos crearContactanos(@RequestBody Contactanos entity){
        return _iContactanosServicios.CrearContactanos(entity);
    }

    @CrossOrigin("*")
    @DeleteMapping("/eliminarContact/{id}")
    public void eliminarContactanos(@PathVariable Integer id){
        _iContactanosServicios.EliminarContactanos(id);
    }

}
