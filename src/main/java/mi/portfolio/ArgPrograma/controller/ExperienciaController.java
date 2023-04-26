package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.Experiencia;
import mi.portfolio.ArgPrograma.service.ExperienciaService;
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
//ruta de experiencia
@RequestMapping("experiencia") //localhost:8080/experiencia/
//con que/cual se va a cruzar(con angular)
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService expServ;
    
    //metodos
    @GetMapping ("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return expServ.buscarExperiencia(id);
    }
  
    @PostMapping ("/crear")
    public String agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
        return "La experiencia fue creada con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        expServ.borrarExperiencia(id);
        return "La experiencia fue borrada con exito";
    }
    
    //otra forma de editar experiencia
    @PutMapping("/editar")
    public String updateExperiencia(@RequestBody Experiencia exp) {
        expServ.editarExperiencia(exp);
        return "La experiencia se actualizo con exito";
    }
       
    @PutMapping("/editar/{id}")
    public String updateExperienciaId(@PathVariable int id, Experiencia exp) {
        expServ.editarExperienciaId(exp);
        return "La experiencia se actualizo con exito.";
    }

}
