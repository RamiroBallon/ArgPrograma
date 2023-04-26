package mi.portfolio.ArgPrograma.repository;

import mi.portfolio.ArgPrograma.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Integer> {
    
}
