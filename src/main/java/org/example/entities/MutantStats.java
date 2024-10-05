package org.example.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "Mutant stats")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Setter
@Getter
public class MutantStats extends Base {

    @Column(name = "ContadorMutante")
    private int mutantCounter =0;
    @Column(name = "ContadorHumano")
    private int humanCounter =0;

    private double ratio;
}
