package com.tarea03.controller;

import com.tarea03.dao.ContactoDao;
import com.tarea03.dao.RecetaDao;
import com.tarea03.domain.Contacto;
import com.tarea03.domain.Receta;
import com.tarea03.service.ContactoService;
import com.tarea03.service.RecetaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    private RecetaService recetaService;

    @Autowired
    private ContactoDao contactoDao;

    @RequestMapping("/")
    public String inicio(Model model) {
        return "index";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        log.info("Ahora se usa la arquitectura MVC");

        var recetas = recetaDao.findAll();
        model.addAttribute("recetas", recetas);
        return "listar";
    }

    @RequestMapping("/insertar")
    public String insertar(Model model) {
        return "insertar";
    }

    @PostMapping("/guardarReceta")
    public String guardarReceta(Receta receta) {
        recetaService.save(receta);
        return "redirect:/";
    }

    @RequestMapping("/contactenos")
    public String contactenos(Model model) {
        return "contactenos";
    }

    @PostMapping("/guardarContacto")
    public String guardarContacto(Contacto contacto) {
        contactoService.save(contacto);
        return "redirect:/";
    }
    @GetMapping("/modificarReceta/{id_receta}")
    public String modificarReceta(Receta receta, Model model) {
        var respuesta = recetaService.getReceta(receta);
        model.addAttribute("receta", respuesta);
        return "insertar";
    }
    
    @GetMapping("/eliminarReceta/{id_receta}")
    public String eliminarReceta(Receta receta){
        recetaService.delete(receta);
        return "listar";
    }
}
