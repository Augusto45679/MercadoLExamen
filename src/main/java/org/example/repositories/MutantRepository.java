package org.example.repositories;

import org.example.entities.Mutant;
import org.springframework.stereotype.Repository;

@Repository
public interface MutantRepository extends BaseRepository<Mutant, Long> {

}
