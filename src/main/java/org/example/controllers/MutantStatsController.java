package org.example.controllers;

import org.example.entities.MutantStats;
import org.example.services.MutantStatsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MutantStatsController{

    @Autowired
    private MutantStatsServiceImpl mutantStatsService;

    public MutantStatsController(MutantStatsServiceImpl mutantStatsService) {
        this.mutantStatsService = mutantStatsService;
    }

    @GetMapping("/stats")
    public MutantStats getStats(){
        return mutantStatsService.mutantStats();
    }

}
