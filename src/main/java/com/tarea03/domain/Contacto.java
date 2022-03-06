package com.tarea03.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="contacto")
public class Contacto implements Serializable {
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contacto;
    private String nombre_contacto;
    private String apellidos_contacto;
    private String correo_contacto;
    private String telefono_contacto;
    
    public Contacto() {
    }

    public Contacto(Long id_contacto, String nombre_contacto, String apellidos_contacto, String correo_contacto, String telefono_contacto) {
        this.id_contacto = id_contacto;
        this.nombre_contacto = nombre_contacto;
        this.apellidos_contacto = apellidos_contacto;
        this.correo_contacto = correo_contacto;
        this.telefono_contacto = telefono_contacto;
    }

}
