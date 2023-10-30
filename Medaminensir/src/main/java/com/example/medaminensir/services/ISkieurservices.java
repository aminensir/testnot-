package com.example.medaminensir.services;

import com.example.medaminensir.entity.Skieur;

import java.util.List;

public interface ISkieurservices {
    List<Skieur> retrieveAllSkieur();

    Skieur addEtudiant(Skieur s);

    Skieur updateEtudiant(Skieur s);

    Skieur retrieveSkieur(Long numSkieur);

    void removeSkieur(Long numSkieur);
}

