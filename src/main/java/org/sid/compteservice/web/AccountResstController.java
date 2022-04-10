package org.sid.compteservice.web;

import org.sid.compteservice.dtos.VerementRequestDTO;
import org.sid.compteservice.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountResstController {
    @Autowired
    private CompteService compteService;

    @PutMapping(path="comptes/virement")
    public void virement (@RequestBody VerementRequestDTO request){
        compteService.verement(request.getCodeSource(), request.getCodeDestination(), request.getMontant());
    }
}
