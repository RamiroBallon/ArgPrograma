package mi.portfolio.ArgPrograma.repository;

import mi.portfolio.ArgPrograma.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository <Contacto, Integer> {
    
}
