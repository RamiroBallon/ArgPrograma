package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Persona;
import mi.portfolio.ArgPrograma.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class PersonaService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public PersonaRepository persoRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de personas . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de personas
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas= persoRepo.findAll();
        return listaPersonas;
    }
    
    //buscar unapersona por id
      public Persona buscarPersona(int id) {
        //si no encuentra la persona devuelve nulo (null)
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    //metodo crear
    public void crearPersona(Persona perso){
    persoRepo.save(perso);
    }
    
    //metodo borrar
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }
    //metodo editar
     public void editarPersona(Persona perso){
    persoRepo.save(perso);
    }
     
     
     
     //METODOS DEL LOGIN
     //login
     //public Persona loginPersona(String pers, String contraseña);
     
     //traer persona
     //public List<Persona> getPersona();
     
     //guardar objeto persona
     //public void savePersona(Persona pers);
     
     
     //Metodo login
     public Persona loginPersona(String email, String clave) {
         List <Persona> personas = persoRepo.findByEmailAndClave(email, clave);
         if(!personas.isEmpty()){
             return personas.get(0); //si la lista no esta vacia me devuelve la de la posicion 0
         }
         return null;
     }
             
}
