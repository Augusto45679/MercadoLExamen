package org.example.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MutantStats extends Base {

    private int mutantCounter =0;
    private int humanCounter =0;
    private double ratio;
}
