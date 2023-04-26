package mi.portfolio.ArgPrograma.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mi.portfolio.ArgPrograma.entity.RedSocial;
import mi.portfolio.ArgPrograma.repository.RedSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//transactional ayuda a la persistencia de datos
@Transactional
public class RedSocialService {
    
    //autowired porque esta ligado al otro, es una cadena, autocableado
    //Sobreescritura del repositorio
    @Autowired
    public RedSocialRepository redSocRepo;
    
    //override: sobreescrito
    //DECLARAMOS LOS METODOS QUE VAMOS A USAR
    
    //declaramos metodo de ver la lista de redes sociales . (findAll=buscar todo, estos metodos salen del jpa)
    //buscar lista de redes Sociales
    public List<RedSocial> verRedesSociales() {
        List<RedSocial> listaRedesSociales= redSocRepo.findAll();
        return listaRedesSociales;
    }
    
    //buscar una red social por id
      public RedSocial buscarRedSocial(int id) {
        //si no encuentra la redSocRepona devuelve nulo (null)
        RedSocial redSoc = redSocRepo.findById(id).orElse(null);
        return redSoc;
    }
    
    //metodo crear
    public void crearRedSocial(RedSocial redSoc){
    redSocRepo.save(redSoc);
    }
    
    //metodo borrar
    public void borrarRedSocial(int id) {
        redSocRepo.deleteById(id);
    }
    //metodo editar
     public void editarRedSocial(RedSocial redSoc){
    redSocRepo.save(redSoc);
    }
}
