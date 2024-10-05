package org.example.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;


@Table(name = "mutants")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Audited
public class Mutant extends Base{

    @Column(name = "sequence", unique = true,length = 1000)
    private String sequence;

    @Column(nullable = false)
    private boolean esMutante;
}
