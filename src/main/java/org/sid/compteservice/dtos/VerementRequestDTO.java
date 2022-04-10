package org.sid.compteservice.dtos;

import lombok.Data;

@Data
public class VerementRequestDTO {
    private Long codeSource;
    private Long codeDestination;
    private double montant;
}
