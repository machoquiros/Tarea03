package com.tarea03.service;

import com.tarea03.domain.Contacto;
import java.util.List;

public interface ContactoService {
    public List<Contacto> getContactos();
    
    public void save(Contacto contacto);
    
    public void delete(Contacto contacto);
    
    public Contacto getContacto(Contacto contacto);
}
