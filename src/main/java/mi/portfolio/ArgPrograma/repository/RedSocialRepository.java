package mi.portfolio.ArgPrograma.repository;

import mi.portfolio.ArgPrograma.entity.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository <RedSocial, Integer> {
    
}
