package com.example.medaminensir.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private Integer numSemaine;

    public Inscription(Long numInscription, Integer numSemaine) {
        this.numInscription = numInscription;
        this.numSemaine = numSemaine;
    }

    public Long getNumInscription() {
        return numInscription;
    }

    public void setNumInscription(Long numInscription) {
        this.numInscription = numInscription;
    }

    public Integer getNumSemaine() {
        return numSemaine;
    }

    public void setNumSemaine(Integer numSemaine) {
        this.numSemaine = numSemaine;
    }
    @ManyToOne
    Skieur Skieur;
    @ManyToOne
    Cours Cours;
}
