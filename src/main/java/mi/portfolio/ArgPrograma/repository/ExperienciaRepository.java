package mi.portfolio.ArgPrograma.repository;

import mi.portfolio.ArgPrograma.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer> {
    
}
