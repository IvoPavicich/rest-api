package restapi.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.demo.models.Autos;
import restapi.demo.repositories.IAutoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AutoService {

    private IAutoRepository autoRepo;
    /* inyección de dependencia por constructor*/
    @Autowired
    public AutoService(IAutoRepository autoRepo){
        this.autoRepo=autoRepo;
    }
    //metodo para crear
    public void crearAuto(Autos autos){
        autoRepo.save(autos);
    }
    //lista
    public List<Autos> listar(){
        return autoRepo.findAll();
    }
    //buscar por id
    public Optional<Autos> buscarPorId(Long id){
        return autoRepo.findById(id);
    }
    //update
    public void actualizar(Autos auto){

        autoRepo.save(auto);
    }

    //delete
    public void eliminarAuto(Long id){
        autoRepo.deleteById(id);
    }

    //metodo buscar por atributo de clase
    public List<Autos> buscarPorMarca(String marca){
        return autoRepo.findByMarca(marca);
    }
}
