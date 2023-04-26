package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.RedSocial;
import mi.portfolio.ArgPrograma.service.RedSocialService;
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
//ruta de redSocial
@RequestMapping("redSocial") //localhost:8080/redSocial/
//con que/cual se va a cruzar(con angular)
@CrossOrigin(origins = "http://localhost:4200")
public class RedSocialController {
    
    @Autowired
    RedSocialService redSocServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <RedSocial> verRedesSociales(){
        return redSocServ.verRedesSociales();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public RedSocial verRedSocial(@PathVariable int id){
        return redSocServ.buscarRedSocial(id);
    }
  
    @PostMapping ("/crear")
    public String agregarRedSocial(@RequestBody RedSocial redSoc){
        redSocServ.crearRedSocial(redSoc);
        return "La red social fue creada con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarRedSocial(@PathVariable int id){
        redSocServ.borrarRedSocial(id);
        return "La red social fue borrada con exito";
    }
    
    //otra forma de editar red social
    @PutMapping("/editar")
    public String updateRedSocial(@RequestBody RedSocial redSoc) {
        redSocServ.editarRedSocial(redSoc);
        return "La red social se actualizo con exito";
    }
    
}
