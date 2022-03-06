package com.tarea03.dao;

import com.tarea03.domain.Receta;
import org.springframework.data.repository.CrudRepository;

public interface RecetaDao extends CrudRepository<Receta, Long>{
    
}
