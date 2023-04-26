package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.Proyecto;
import mi.portfolio.ArgPrograma.service.ProyectoService;
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
//ruta de proyecto
@RequestMapping("proyecto") //localhost:8080/proyecto/
//con que/cual se va a cruzar(con angular)
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired
    ProyectoService proyectServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return proyectServ.verProyectos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyectServ.buscarProyecto(id);
    }
  
    @PostMapping ("/crear")
    public String agregarProyecto(@RequestBody Proyecto proyect){
        proyectServ.crearProyecto(proyect);
        return "El proyecto fue creado con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        proyectServ.borrarProyecto(id);
        return "El proyecto fue borrado con exito";
    }
    
    //otra forma de editar proyecto
    @PutMapping("/editar")
    public String updateProyecto(@RequestBody Proyecto proyect) {
        proyectServ.editarProyecto(proyect);
        return "El proyecto se actualizo con exito";
    }
    
}
