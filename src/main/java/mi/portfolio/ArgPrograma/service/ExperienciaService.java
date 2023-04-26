package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Experiencia;
import mi.portfolio.ArgPrograma.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class ExperienciaService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public ExperienciaRepository expRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de experiencias . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de experiencias
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias= expRepo.findAll();
        return listaExperiencias;
    }
    
    //buscar una experiencia por id
      public Experiencia buscarExperiencia(int id) {
        //si no encuentra la exp devuelve nulo (null)
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
    
    //metodo crear
    public void crearExperiencia(Experiencia exp){
        expRepo.save(exp);
    }
    
    //metodo borrar
    public void borrarExperiencia(int id) {
        expRepo.deleteById(id);
    }
    //metodo editar
    public void editarExperiencia(Experiencia exp){
        expRepo.save(exp);
    }

    public void editarExperienciaId(Experiencia exp) {
        expRepo.save(exp);
        
    }

}
