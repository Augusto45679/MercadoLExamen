package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class MutantResponse {

    @JsonProperty("mutantCounter")
    private long mutantCounter;

    @JsonProperty("humanCounter")
    private long humanCounter;

    private int ratio;
}
