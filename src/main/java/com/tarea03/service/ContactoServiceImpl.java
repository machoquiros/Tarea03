package com.tarea03.service;

import com.tarea03.dao.ContactoDao;
import com.tarea03.domain.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceImpl implements ContactoService {
    @Autowired
    private ContactoDao contactoDao;
    
    @Override
    @Transactional (readOnly = true) //Para manejar transacciones de lectura
    public List<Contacto> getContactos() {
        return (List<Contacto>)contactoDao.findAll();
    }

    @Override
    @Transactional //Para manejar transacciones de escritura y lecura
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    @Transactional //Para manejar transacciones de escritura y lecura
    public void delete(Contacto contacto) {
        contactoDao.delete(contacto);
    }

    @Override
    @Transactional (readOnly = true) //Para manejar transacciones de lectura
    public Contacto getContacto(Contacto contacto) {
        return contactoDao.findById(contacto.getId_contacto()).orElse(null);
    }
}
