package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.Persona;
import mi.portfolio.ArgPrograma.service.PersonaService;
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
//ruta de persona
@RequestMapping("persona") //localhost:8080/persona/
//con que/cual se va a cruzar(con angular)
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-fe-8cf8a.web.app")
public class PersonaController {
    
    @Autowired
    PersonaService persoServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
  
    @PostMapping ("/crear")
    public String agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada con exito";
    }
    
    //otra forma de editar persona
    @PutMapping("/editar")
    public String updatePersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
        return "La persona se actualizo con exito";
    }
    
    /*@PutMapping("/editar")
    public void updatePersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }*/
    
    //LOGIN
    @PostMapping("/autentificacion/login")
    public Persona loginPersona(@RequestBody Persona pers){
        return persoServ.loginPersona(pers.getEmail(), pers.getClave());
    }
}
