package com.tarea03.controller;

import com.tarea03.dao.ContactoDao;
import com.tarea03.dao.RecetaDao;
import com.tarea03.domain.Contacto;
import com.tarea03.service.ContactoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private RecetaDao recetaDao;
    
    @Autowired
    private ContactoService contactoService;
    
    @Autowired
    private ContactoDao contactoDao;
    
    @RequestMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa la arquitectura MVC");

        var recetas = recetaDao.findAll();
        model.addAttribute("recetas", recetas);
        return "index";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        log.info("Ahora se usa la arquitectura MVC");

        var recetas = recetaDao.findAll();
        model.addAttribute("recetas", recetas);
        return "listar";
    }
    
    @RequestMapping("/contactenos")
    public String contactenos (Model model){
        return "contactenos";
    }   
    
    @PostMapping("/guardarContacto")
    public String guardarContacto(Contacto contacto){
        contactoService.save(contacto);
        return "redirect:/";
    }

}
