package com.example.demoThymeleaf.metier;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivreService {

    private int idCount = 0;
    private List<Livre> livres = new ArrayList<>();

    public List<Livre> getLivres() {
        return livres;
    }

    public void addLivre(Livre livre){
        idCount++;
        livre.setId(idCount);
        livres.add(livre);
    }

    public Livre findById(Integer id){
        for(Livre livre : livres)
            if(livre.getId().equals(id))
                return livre;
        return null;
    }
}
