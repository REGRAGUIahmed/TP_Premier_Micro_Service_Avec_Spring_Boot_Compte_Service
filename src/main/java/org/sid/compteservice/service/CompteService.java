package org.sid.compteservice.service;

public interface CompteService {
    void verement (Long codeSource, Long codeDestination, double montant);
}
