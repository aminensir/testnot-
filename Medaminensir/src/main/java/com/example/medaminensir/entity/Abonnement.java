package com.example.medaminensir.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

    public Abonnement(Long numAbon, LocalDate dateDebut, LocalDate dateFin, Float prixAbon, TypeAbonnement typeAbon) {
        this.numAbon = numAbon;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixAbon = prixAbon;
        this.typeAbon = typeAbon;
    }

    public Long getNumAbon() {
        return numAbon;
    }

    public void setNumAbon(Long numAbon) {
        this.numAbon = numAbon;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Float getPrixAbon() {
        return prixAbon;
    }

    public void setPrixAbon(Float prixAbon) {
        this.prixAbon = prixAbon;
    }

    public TypeAbonnement getTypeAbon() {
        return typeAbon;
    }

    public void setTypeAbon(TypeAbonnement typeAbon) {
        this.typeAbon = typeAbon;
    }
}
