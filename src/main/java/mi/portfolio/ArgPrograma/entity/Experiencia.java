package mi.portfolio.ArgPrograma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
  
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_empresa;
    private String logo;
    private String link;
    private String puesto;
    private String fecha_inicio;
    private String fecha_fin;
    //@Lob
    @Column(length=2000)
    private String descripcion;

    //constructor vacio
    public Experiencia() {
    }

    //constructor con parametros
    public Experiencia(String nombre_empresa, String logo, String link, String puesto, String fecha_inicio, String fecha_fin, String descripcion) {
        this.nombre_empresa = nombre_empresa;
        this.logo = logo;
        this.link = link;
        this.puesto = puesto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
