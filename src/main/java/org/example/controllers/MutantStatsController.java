package org.example.controllers;

import org.example.entities.MutantStats;
import org.example.services.MutantServiceImpl;
import org.example.services.MutantStatsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = " ")
public class MutantStatsController extends BaseControllerImpl<MutantStats, MutantStatsServiceImpl> {

    @Autowired
    private MutantStatsServiceImpl mutantStatsServiceImpl;
}
