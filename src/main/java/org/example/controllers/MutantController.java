package org.example.controllers;

import org.example.entities.Mutant;
import org.example.repositories.MutantRepository;
import org.example.services.MutantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/mutant")
public class MutantController  extends BaseControllerImpl<Mutant, MutantServiceImpl>{

    @Autowired
    private MutantServiceImpl mutantServiceImpl;

    // public ResponseEntity<String> checkMutant(@RequestBody String[] dna){
       //     try{
         //       return ResponseEntity.status(HttpStatus.OK).body(service.isMutant(dna));
           // } catch (Exception e) {
    //            throw new RuntimeException(e);
            //}
  //  }


}
