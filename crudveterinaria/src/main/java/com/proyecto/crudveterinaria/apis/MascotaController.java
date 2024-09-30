package com.proyecto.crudveterinaria.apis;

import com.proyecto.crudveterinaria.modelo.Cliente;
import com.proyecto.crudveterinaria.modelo.Mascota;
import com.proyecto.crudveterinaria.servicios.IMascotaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    IMascotaServicios _mascotaServicios;

    @Autowired
    public MascotaController(IMascotaServicios mascotaServicios){
        this._mascotaServicios = mascotaServicios;
    }

    @CrossOrigin("*")
    @GetMapping("/listadoMascot")
    public List<Mascota> listaDeMascota(){
        return _mascotaServicios.ListadoMascota();
    }

    @CrossOrigin("*")
    @GetMapping("/buscarMascot/{id}")
    public Mascota busquedaDeMascota(@PathVariable int id){
        return _mascotaServicios.BuscarMascota(id);
    }

    @CrossOrigin("*")
    @PostMapping("/crearMascot")
    public Mascota crearMascota(@RequestBody Mascota entity){
        return _mascotaServicios.CrearMascota(entity);
    }

    @CrossOrigin("*")
    @PutMapping("/modificarMascot/{id}")
    public Mascota modificarMascota(@PathVariable int id, @RequestBody Mascota entity){
        return _mascotaServicios.ModificarMascota(id,entity);
    }

    @CrossOrigin("*")
    @DeleteMapping("/eliminarMascot/{id}")
    public void eliminarMascota(@PathVariable Integer id){
        _mascotaServicios.EliminarMascota(id);
    }

}
