package mi.portfolio.ArgPrograma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Contacto {
    @Id
    //generatedValue para los autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String celular;

    //constructor vacio
    public Contacto() {
    }
    //constructor con parametros
    public Contacto(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }
    //getters (obtener un valor) y setters (signar, establecer un valor)
    //los getters hacen y retornan, los setters hacen pero no retornan
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
