package com.example.medaminensir.services;

import com.example.medaminensir.entity.Skieur;

import java.util.List;

public class Skieurservices {

    @Override
    public List<Skieur> retrieveAllSkieur() {
        return SkieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur s) {
        return SkieurRepository.save(s);
    }

    @Override
    public Skieur updateEtudiant(Skieur s) {
        return SkieurRepository.save(s);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return SkieurRepository.findById(numSkieur).get();
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        SkieurRepository.deleteById(numSkieur);

    }
}

