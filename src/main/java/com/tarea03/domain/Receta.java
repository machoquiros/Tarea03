package com.tarea03.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "receta")
public class Receta implements Serializable {

//        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_receta;
    private String nombre_receta;
    private int duracion_receta;
    private String dificultad_receta;
    private String ingredientes_receta;
    private String preparacion_receta;
    private float calificacion_receta;

    public Receta() {
    }

    public Receta(String nombre_receta, int duracion_receta, String dificultad_receta, String ingredientes_receta, String preparacion_receta, float calificacion_receta) {
        this.nombre_receta = nombre_receta;
        this.duracion_receta = duracion_receta;
        this.dificultad_receta = dificultad_receta;
        this.ingredientes_receta = ingredientes_receta;
        this.preparacion_receta = preparacion_receta;
        this.calificacion_receta = calificacion_receta;
    }

}
