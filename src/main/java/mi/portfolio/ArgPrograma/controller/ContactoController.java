package mi.portfolio.ArgPrograma.controller;

import java.util.List;
import mi.portfolio.ArgPrograma.entity.Contacto;
import mi.portfolio.ArgPrograma.service.ContactoService;
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
//ruta de contacto
@RequestMapping("contacto") //localhost:8080/contacto/
//con que/cual se va a cruzar(con angular)
@CrossOrigin(origins = "http://localhost:4200")
public class ContactoController {
    
        @Autowired
    ContactoService contactServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Contacto> verContactos(){
        return contactServ.verContactos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Contacto verContacto(@PathVariable int id){
        return contactServ.buscarContacto(id);
    }
  
    @PostMapping ("/crear")
    public String agregarContacto(@RequestBody Contacto contact){
        contactServ.crearContacto(contact);
        return "El contacto fue creado con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarContacto(@PathVariable int id){
        contactServ.borrarContacto(id);
        return "El contacto fue borrado con exito";
    }
    
    //otra forma de editar contacto
    @PutMapping("/editar")
    public String updateContacto(@RequestBody Contacto contact) {
        contactServ.editarContacto(contact);
        return "El contacto se actualizo con exito";
    }
    
}
