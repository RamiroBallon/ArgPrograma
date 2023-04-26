package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Contacto;
import mi.portfolio.ArgPrograma.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class ContactoService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public ContactoRepository contactRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de contactos . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de contactos
    public List<Contacto> verContactos() {
        List<Contacto> listaContactos= contactRepo.findAll();
        return listaContactos;
    }
    
    //buscar un contacto por id
      public Contacto buscarContacto(int id) {
        //si no encuentra el contacto devuelve nulo (null)
        Contacto contact = contactRepo.findById(id).orElse(null);
        return contact;
    }
    
    //metodo crear
    public void crearContacto(Contacto contact){
    contactRepo.save(contact);
    }
    
    //metodo borrar
    public void borrarContacto(int id) {
        contactRepo.deleteById(id);
    }
    //metodo editar
     public void editarContacto(Contacto contact){
    contactRepo.save(contact);
    }
    
}
