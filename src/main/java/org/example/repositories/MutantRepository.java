package org.example.repositories;

import org.example.entities.Mutant;
import org.example.entities.MutantStats;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;


@Repository
public interface MutantRepository extends BaseRepository<Mutant, Long> {
        // Optional<Mutant> findBydna(String dna);
        long countBydna(boolean isMutant);


}
