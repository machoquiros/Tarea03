package com.tarea03.service;

import com.tarea03.domain.Receta;
import java.util.List;

public interface RecetaService {

    public List<Receta> getRecetas(); //obtiene todos los clientes de la base de datos

    public void save(Receta receta); //agrega si el id viene en 0 y si no edita ese cliente

    public void delete(Receta receta); //borra por medio del parametro id

    public Receta getReceta (Receta receta); //obtiene un cliente por el id

}
