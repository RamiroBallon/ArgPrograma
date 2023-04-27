package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.Estudio;
import mi.portfolio.ArgPrograma.service.EstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
//ruta de estudio
@RequestMapping("estudio") //localhost:8080/estudio/
//con que/cual se va a cruzar(con angular)
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-fe-8cf8a.web.app")
public class EstudioController {
    
    @Autowired
    EstudioService estudiServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Estudio> verEstudios(){
        return estudiServ.verEstudios();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id){
        return estudiServ.buscarEstudio(id);
    }
  
    @PostMapping ("/crear")
    public String agregarEstudio(@RequestBody Estudio estudi){
        estudiServ.crearEstudio(estudi);
        return "El estudio fue creado con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarEstudio(@PathVariable int id){
        estudiServ.borrarEstudio(id);
        return "El estudio fue borrado con exito";
    }
    
    //otra forma de editar estudio
    @PutMapping("/editar")
    public String updateEstudio(@RequestBody Estudio estudi) {
        estudiServ.editarEstudio(estudi);
        return "El estudio se actualizo con exito";
    }
    
}
