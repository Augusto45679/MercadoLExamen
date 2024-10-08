package org.example.controllers;

import org.example.entities.Base;
import org.example.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


public abstract class BaseControllerImpl<E extends Base,S extends BaseServiceImpl<E,Long>> implements BaseController<E,Long> {

    @Autowired
    protected S service;

   // @GetMapping("")
    // public ResponseEntity<?> getAll(){
    //  Object HttpStatus;
    //  try{
    //      return ResponseEntity.status(org.springframework.http.HttpStatus.OK).body(service.findAll());
    //  } catch (Exception e) {
    //      return ResponseEntity.status(org.springframework.http.HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde\"}");
    //  }

    //}
    //@GetMapping("/{id}")
    //public ResponseEntity<?> getOne(Long id){
    //  try{
    //      return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    //  } catch (Exception e) {
    //      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde\"}");
    //  }
//    }
     @PostMapping("/save")
    public ResponseEntity<?> save(E entity){
      try{
          return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
      } catch (Exception e) {
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde\"}");
      }
     }

    //@PostMapping("/{id}")
    //public ResponseEntity<?> update(Long id, E entity){
    //  try{
    //      return ResponseEntity.status(HttpStatus.OK).body(service.update(id,entity));
    //  } catch (Exception e) {
    //      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde\"}");
    //  }
    //}
    //@DeleteMapping("/{id}")
    //public ResponseEntity<?> delete(Long id){
    //  try{
    //      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));
    //  } catch (Exception e) {
    //      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde\"}");
    //  }
    //}
}
