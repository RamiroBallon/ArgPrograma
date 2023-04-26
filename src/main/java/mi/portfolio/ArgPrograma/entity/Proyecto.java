package mi.portfolio.ArgPrograma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//annotations=definimos a persona como entidad. cuando corramos el proyecto se genera la tabla con esos atributos
@Entity
public class Proyecto {
    
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String imagen;
    private String link;
    //@Lob
    @Column(length=2000)
    private String descripcion;

    
    public Proyecto() {
    }

    public Proyecto(String titulo, String imagen, String link, String descripcion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.link = link;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
