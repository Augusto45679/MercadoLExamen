package org.example.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MutantStats extends Base {

    @JsonProperty("mutantCounter")
    private long mutantCounter;

    @JsonProperty("humanCounter")
    private long humanCounter;

    private double ratio;
}
