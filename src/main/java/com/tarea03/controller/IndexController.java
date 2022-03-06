package com.tarea03.controller;

import com.tarea03.dao.RecetaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private RecetaDao recetaDao;
    
    @RequestMapping("/")
    public String inicio (Model model){
        log.info("Ahora se usa la arquitectura MVC");
        
        var recetas = recetaDao.findAll();
        model.addAttribute("recetas", recetas);
        return "listar";
    }
    
        @RequestMapping("/contactenos")
    public String contactenos (Model model){
//        log.info("Ahora se usa la arquitectura MVC");
//        
//        var recetas = recetaDao.findAll();
//        model.addAttribute("recetas", recetas);
        return "contactenos";
    }
}
