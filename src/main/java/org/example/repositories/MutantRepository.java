package org.example.repositories;

import org.example.entities.Mutant;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;


@Repository
public interface MutantRepository extends BaseRepository<Mutant, Long> {
        Optional<Mutant> findBydna(String dnaSequence);

        long countBydna(boolean isMutant);
}
