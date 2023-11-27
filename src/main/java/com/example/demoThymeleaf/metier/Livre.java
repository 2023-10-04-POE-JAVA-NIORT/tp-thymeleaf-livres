package com.example.demoThymeleaf.metier;

import java.time.LocalDate;

public class Livre {

    private Integer id;
    private String titre;
    private LocalDate dateDeParution;
    private String resume;

    public Livre() {
    }

    public Livre(String titre) {
        this.titre = titre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateDeParution() {
        return dateDeParution;
    }

    public void setDateDeParution(LocalDate dateDeParution) {
        this.dateDeParution = dateDeParution;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", dateDeParution=" + dateDeParution +
                ", resume='" + resume + '\'' +
                '}';
    }
}
