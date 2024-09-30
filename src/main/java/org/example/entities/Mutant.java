package org.example.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;

@Table
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Audited
public class Mutant extends Base{


}
