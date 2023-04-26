package mi.portfolio.ArgPrograma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Estudio {
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo_especialidad;
    private String institucion;
    private String fecha_inicio;
    private String fecha_fin;
    //@Lob
    @Column(length=2000)
    private String descripcion;
    private String imagen;

    public Estudio() {
    }

    public Estudio(String titulo_especialidad, String institucion, String fecha_inicio, String fecha_fin, String descripcion, String imagen) {
        this.titulo_especialidad = titulo_especialidad;
        this.institucion = institucion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo_especialidad() {
        return titulo_especialidad;
    }

    public void setTitulo_especialidad(String titulo_especialidad) {
        this.titulo_especialidad = titulo_especialidad;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
