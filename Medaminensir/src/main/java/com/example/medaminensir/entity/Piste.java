package com.example.medaminensir.entity;

import jakarta.persistence.*;

import java.util.Set;

public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NumPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

    public Piste(Long numPiste, String nomPiste, Couleur couleur, Integer longeur, Integer pente) {
        NumPiste = numPiste;
        this.nomPiste = nomPiste;
        this.couleur = couleur;
        this.longeur = longeur;
        this.pente = pente;
    }

    public Long getNumPiste() {
        return NumPiste;
    }

    public void setNumPiste(Long numPiste) {
        NumPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Integer getLongeur() {
        return longeur;
    }

    public void setLongeur(Integer longeur) {
        this.longeur = longeur;
    }

    public Integer getPente() {
        return pente;
    }

    public void setPente(Integer pente) {
        this.pente = pente;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> Skieur;
}
