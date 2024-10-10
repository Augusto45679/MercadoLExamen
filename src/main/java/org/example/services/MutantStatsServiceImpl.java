package org.example.services;


import org.example.entities.MutantStats;
import org.example.repositories.BaseRepository;
import org.example.repositories.MutantRepository;
import org.example.repositories.MutantStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class MutantStatsServiceImpl{

    @Autowired
    private MutantRepository mutantRepository;

    public MutantStatsServiceImpl(MutantRepository mutantRepository ) {
        this.mutantRepository = mutantRepository;

    }

    public MutantStats mutantStats(){
            long mutantCounter = mutantRepository.countBydna(true);
            long humanCounter = mutantRepository.countBydna(false);
            double ratio = humanCounter == 0 ? 0 : (double) mutantCounter / humanCounter;
        return new MutantStats(mutantCounter,humanCounter,ratio);
    }

}

