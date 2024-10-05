package org.example.controllers;

import org.example.entities.Mutant;
import org.example.services.MutantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class MutantController  extends BaseControllerImpl<Mutant, MutantServiceImpl> {

    @Autowired
    private MutantServiceImpl mutantServiceImpl;

    @PostMapping(path = "/mutant")
     public ResponseEntity<?> checkMutant(@RequestBody String[] dna){
          try{
            return ResponseEntity.status(HttpStatus.OK).body(service.isMutant(dna));
        } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }
     }
    @GetMapping(path ="/stats")
    public ResponseEntity<?> getStatsMutant(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(mutantServiceImpl.getStats());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde\"}");
        }
    }
    @PostMapping("/mutant/save")
    @Override
    public ResponseEntity<?> save(Mutant entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde\"}");
        }
    }


}
