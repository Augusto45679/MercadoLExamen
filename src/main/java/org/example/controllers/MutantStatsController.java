package org.example.controllers;

import org.example.entities.MutantStats;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = " ")
public class MutantStatsController extends BaseControllerImpl<MutantStats,Long> {
}
