package org.example.controllers;

import org.example.entities.Mutant;
import org.example.repositories.MutantRepository;
import org.example.services.MutantServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin()
@RequestMapping(path = "/mutant")
public class MutantController  extends BaseControllerImpl<Mutant, MutantServiceImpl>{

}
