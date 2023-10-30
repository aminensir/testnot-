package com.example.medaminensir.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    public Skieur(Long numSkieur, String nomS, String prenomS, LocalDate dateNaissance, String ville) {
        this.numSkieur = numSkieur;
        this.nomS = nomS;
        this.prenomS = prenomS;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    public Long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(Long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy="Skieur")
    private Set<Inscription> Inscription;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> Piste;

}
