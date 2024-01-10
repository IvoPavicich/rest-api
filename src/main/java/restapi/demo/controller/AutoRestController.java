package restapi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.demo.models.Autos;
import restapi.demo.services.AutoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class AutoRestController {
    private AutoService autoService;
    @Autowired
    public AutoRestController(AutoService autoService) {
        this.autoService = autoService;
    }
    @PostMapping(value="crear",headers = "Accept=application/json")
    public void crearAuto(@RequestBody Autos autos){
        autoService.crearAuto(autos);
    }

    @GetMapping(value="listar",headers = "Accept=application/json")
    public List<Autos>listarAutos(){
        return autoService.listar();
    }
    @GetMapping(value="buscarPorId/{id}",headers = "Accept=application/json")
    public Optional<Autos> buscarPorId(@PathVariable Long id){
        return autoService.buscarPorId(id);
    }
    @PutMapping(value="actualizar",headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Autos auto){
        autoService.actualizar(auto);
    }
    @DeleteMapping(value="eliminar/{id}",headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id){
        autoService.eliminarAuto(id);
    }
    @GetMapping(value="buscarPorMarca/{marca}",headers = "Accept=application/json")
    public List<Autos> listarPorMarca(@PathVariable String marca){
        return autoService.buscarPorMarca(marca);
    }

}
