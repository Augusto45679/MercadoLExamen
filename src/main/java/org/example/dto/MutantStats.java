package org.example.dto;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table
@NoArgsConstructor
@AllArgsConstructor
public class MutantStats {
    private int mutantCounter =0;
    private int humanCounter =0;
    private double ratio;
}
