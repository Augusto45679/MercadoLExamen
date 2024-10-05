package org.example.controllers;

import org.example.entities.MutantStats;
import org.example.services.MutantStatsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MutantStatsController extends BaseControllerImpl<MutantStats, MutantStatsServiceImpl> {

    @Autowired
    private MutantStatsServiceImpl mutantStatsServiceImpl;
    @PostMapping("/mutant-stats/save")
    @Override
    public ResponseEntity<?> save(MutantStats entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde\"}");
        }
    }

}
