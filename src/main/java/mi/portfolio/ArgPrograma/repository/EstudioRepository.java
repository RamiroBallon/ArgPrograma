package mi.portfolio.ArgPrograma.repository;

import mi.portfolio.ArgPrograma.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Integer> {
    
}
