package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Proyecto;
import mi.portfolio.ArgPrograma.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class ProyectoService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public ProyectoRepository proyectRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de proyectos . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de proyectos
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos= proyectRepo.findAll();
        return listaProyectos;
    }
    
    //buscar un proyecto por id
    public Proyecto buscarProyecto(int id) {
    //si no encuentra el proyecto devuelve nulo (null)
    Proyecto proyect = proyectRepo.findById(id).orElse(null);
    return proyect;
    }
    
    //metodo crear
    public void crearProyecto(Proyecto proyect){
    proyectRepo.save(proyect);
    }
    
    //metodo borrar
    public void borrarProyecto(int id) {
        proyectRepo.deleteById(id);
    }
    //metodo editar
     public void editarProyecto(Proyecto proyect){
    proyectRepo.save(proyect);
    }
    
}
