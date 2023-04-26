package mi.portfolio.ArgPrograma.repository;

import mi.portfolio.ArgPrograma.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Integer> {
    
}