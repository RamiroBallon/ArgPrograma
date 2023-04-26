package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Estudio;
import mi.portfolio.ArgPrograma.repository.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class EstudioService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public EstudioRepository estudiRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de estudios . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de estudios
    public List<Estudio> verEstudios() {
        List<Estudio> listaEstudios= estudiRepo.findAll();
        return listaEstudios;
    }
    
    //buscar un estudio por id
      public Estudio buscarEstudio(int id) {
        //si no encuentra el estudio devuelve nulo (null)
        Estudio estudi = estudiRepo.findById(id).orElse(null);
        return estudi;
    }
    
    //metodo crear
    public void crearEstudio(Estudio estudi){
    estudiRepo.save(estudi);
    }
    
    //metodo borrar
    public void borrarEstudio(int id) {
        estudiRepo.deleteById(id);
    }
    //metodo editar
     public void editarEstudio(Estudio estudi){
    estudiRepo.save(estudi);
    }
    
}
