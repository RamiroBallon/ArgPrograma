package mi.portfolio.ArgPrograma.repository;
//repositorio es el unico que es interface
import java.util.List;
import mi.portfolio.ArgPrograma.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {

    public List<Persona> findByEmailAndClave(String email, String clave);
    //aca tambien se pueden declarar metodos extras
}