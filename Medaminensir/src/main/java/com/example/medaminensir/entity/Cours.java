package com.example.medaminensir.entity;

import jakarta.persistence.*;

import java.util.Set;

public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private Integer creneau;

    public Cours(Long numCours, Integer niveau, TypeCours typeCours, Support support, Float prix, Integer creneau) {
        this.numCours = numCours;
        this.niveau = niveau;
        this.typeCours = typeCours;
        this.support = support;
        this.prix = prix;
        this.creneau = creneau;
    }

    public Long getNumCours() {
        return numCours;
    }

    public void setNumCours(Long numCours) {
        this.numCours = numCours;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public TypeCours getTypeCours() {
        return typeCours;
    }

    public void setTypeCours(TypeCours typeCours) {
        this.typeCours = typeCours;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getCreneau() {
        return creneau;
    }

    public void setCreneau(Integer creneau) {
        this.creneau = creneau;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy="Cours")
    private Set<Inscription> Inscription;
}
