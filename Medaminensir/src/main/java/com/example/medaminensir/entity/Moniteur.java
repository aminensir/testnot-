package com.example.medaminensir.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;

    public long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public Date getDateRecru() {
        return dateRecru;
    }

    public void setDateRecru(Date dateRecru) {
        this.dateRecru = dateRecru;
    }

    public Moniteur(long numMoniteur, String nomM, String prenomM, Date dateRecru) {
        this.numMoniteur = numMoniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateRecru = dateRecru;
    }
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> Cours;
}
