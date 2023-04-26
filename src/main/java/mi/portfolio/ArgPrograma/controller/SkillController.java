package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.Skill;
import mi.portfolio.ArgPrograma.service.SkillService;
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
//ruta de skill
@RequestMapping("skill") //localhost:8080/skill/
//con que/cual se va a cruzar(con angular)
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
    
    @Autowired
    SkillService habilidadServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Skill> verSkills(){
        return habilidadServ.verSkills();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Skill verSkill(@PathVariable int id){
        return habilidadServ.buscarSkill(id);
    }
  
    @PostMapping ("/crear")
    public String agregarSkill(@RequestBody Skill habilidad){
        habilidadServ.crearSkill(habilidad);
        return "La habilidad fue creada con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarSkill(@PathVariable int id){
        habilidadServ.borrarSkill(id);
        return "La habilidad fue borrada con exito";
    }
    
    //otra forma de editar habilidad
    @PutMapping("/editar")
    public String updateSkill(@RequestBody Skill habilidad) {
        habilidadServ.editarSkill(habilidad);
        return "La habilidad se actualizo con exito";
    }
    
}
