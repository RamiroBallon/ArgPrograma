package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Skill;
import mi.portfolio.ArgPrograma.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class SkillService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public SkillRepository habilidadRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de skills . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de skills
    public List<Skill> verSkills() {
        List<Skill> listaSkills= habilidadRepo.findAll();
        return listaSkills;
    }
    
    //buscar un skill por id
      public Skill buscarSkill(int id) {
        //si no encuentra la habilidad devuelve nulo (null)
        Skill habilidad = habilidadRepo.findById(id).orElse(null);
        return habilidad;
    }
    
    //metodo crear
    public void crearSkill(Skill habilidad){
    habilidadRepo.save(habilidad);
    }
    
    //metodo borrar
    public void borrarSkill(int id) {
        habilidadRepo.deleteById(id);
    }
    //metodo editar
     public void editarSkill(Skill habilidad){
    habilidadRepo.save(habilidad);
    }
    
}
