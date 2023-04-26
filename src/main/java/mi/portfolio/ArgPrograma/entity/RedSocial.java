package mi.portfolio.ArgPrograma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//annotations=definimos a persona como entidad. cuando corramos el proyecto se genera la tabla con esos atributos
@Entity
public class RedSocial {
    
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String logo;
    private String link;
    private String title;

    
    public RedSocial() {
    }

    public RedSocial(String logo, String link, String title) {
        this.logo = logo;
        this.link = link;
        this.title = title;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
