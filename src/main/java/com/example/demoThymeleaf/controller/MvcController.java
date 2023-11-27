package com.example.demoThymeleaf.controller;

import com.example.demoThymeleaf.metier.Livre;
import com.example.demoThymeleaf.metier.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {

    @Autowired
    LivreService livreService;

    @GetMapping("livres")
    public String getLivres(Model model){

        model.addAttribute("livres",livreService.getLivres());
        return "livres.html";
    }

    @PostMapping("livres")
    public String addLivre(Livre livre, Model model){

        livreService.addLivre(livre);

        model.addAttribute("livres",livreService.getLivres());
        return "livres.html";
    }

    @GetMapping("details")
    public String afficheDetails(@RequestParam("id") Integer id, Model model){

        Livre livre = livreService.findById(id);

        model.addAttribute("livre", livre);
        return "livre-details.html";
    }
}
