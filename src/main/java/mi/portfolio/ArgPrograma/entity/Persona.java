package mi.portfolio.ArgPrograma.entity;

//ctrl + shift + I
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//annotations=definimos a persona como entidad. cuando corramos el proyecto se genera la tabla con esos atributos
@Entity
@Table (name = "persona")
public class Persona {
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String foto_perfil;
    private String link_foto_perfil;
    private String titulo_especialidad;
    //@Lob //textos largos
    @Column(length=2000)
    private String descripcion_1_sobre_mi;
    @Column(length=2000)
    private String descripcion_2_sobre_mi;
    private String imagen_banner;
    private String titulo_banner;
    
    private String email;
    private String clave;
     
    
    //alt + insert para abrir menú y agregar constructor y getters y setters
    //constructor vacio
    public Persona() {
    }
    //constructor con parametros(sin el id)
    public Persona(String nombre, String apellido, String foto_perfil, String link_foto_perfil, String titulo_especialidad, String descripcion_1_sobre_mi, String descripcion_2_sobre_mi, String imagen_banner, String titulo_banner, String email, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto_perfil = foto_perfil;
        this.link_foto_perfil = link_foto_perfil;
        this.titulo_especialidad = titulo_especialidad;
        this.descripcion_1_sobre_mi = descripcion_1_sobre_mi;
        this.descripcion_2_sobre_mi = descripcion_2_sobre_mi;
        this.imagen_banner = imagen_banner;
        this.titulo_banner = titulo_banner;
        this.email = email;
        this.clave = clave;
        
    }
    
    //getters y setters
  //getters (obtener un valor) y setters (signar, establecer un valor)
    //los getters hacen y retornan, los setters hacen pero no retornan
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public String getLink_foto_perfil() {
        return link_foto_perfil;
    }

    public void setLink_foto_perfil(String link_foto_perfil) {
        this.link_foto_perfil = link_foto_perfil;
    }

    public String getTitulo_especialidad() {
        return titulo_especialidad;
    }

    public void setTitulo_especialidad(String titulo_especialidad) {
        this.titulo_especialidad = titulo_especialidad;
    }

    public String getDescripcion_1_sobre_mi() {
        return descripcion_1_sobre_mi;
    }

    public void setDescripcion_1_sobre_mi(String descripcion_1_sobre_mi) {
        this.descripcion_1_sobre_mi = descripcion_1_sobre_mi;
    }

    public String getDescripcion_2_sobre_mi() {
        return descripcion_2_sobre_mi;
    }

    public void setDescripcion_2_sobre_mi(String descripcion_2_sobre_mi) {
        this.descripcion_2_sobre_mi = descripcion_2_sobre_mi;
    }

    public String getImagen_banner() {
        return imagen_banner;
    }

    public void setImagen_banner(String imagen_banner) {
        this.imagen_banner = imagen_banner;
    }

    public String getTitulo_banner() {
        return titulo_banner;
    }

    public void setTitulo_banner(String titulo_banner) {
        this.titulo_banner = titulo_banner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}
