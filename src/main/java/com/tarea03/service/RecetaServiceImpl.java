package com.tarea03.service;

import com.tarea03.dao.RecetaDao;
import com.tarea03.domain.Receta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecetaServiceImpl implements RecetaService {

    @Autowired
    private RecetaDao recetaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Receta> getRecetas() {
        return (List<Receta>) recetaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Receta receta) {
        recetaDao.save(receta);
    }

    @Override
    @Transactional
    public void delete(Receta receta) {
        recetaDao.delete(receta);
    }

    @Override
    @Transactional(readOnly = true)
    public Receta getCliente(Receta receta) {
        return recetaDao.findById(receta.getId_receta()).orElse(null);
    }

}
