package mi.portfolio.ArgPrograma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skill {
    
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String logo;
    private int porcentaje;

    
    public Skill() {
    }

    public Skill(String logo, int porcentaje) {
        this.logo = logo;
        this.porcentaje = porcentaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}
