package org.example.services;

import org.example.entities.Mutant;
import org.example.repositories.BaseRepository;
import org.example.repositories.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutantServiceImpl extends BaseServiceImpl<Mutant,Long> {

    @Autowired
    private MutantRepository mutantRepository;

    public MutantServiceImpl(BaseRepository<Mutant,Long> baseRepository) {
       super(baseRepository);
    }

    @Override
    public List<Mutant> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Mutant findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Mutant save(Mutant entity) throws Exception {
        return null;
    }

    @Override
    public Mutant update(Long aLong, Mutant entity) throws Exception {
        return null;
    }

    @Override
    public Boolean delete(Long aLong) throws Exception {
        return null;
    }
}
