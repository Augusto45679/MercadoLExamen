package org.example.services;


import org.example.entities.MutantStats;
import org.example.repositories.BaseRepository;
import org.example.repositories.MutantStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutantStatsServiceImpl extends BaseServiceImpl<MutantStats,Long>{

    @Autowired
    private MutantStatsRepository mutantStatsRepository;

    public MutantStatsServiceImpl(BaseRepository<MutantStats, Long> baserepository) {
        super(baserepository);
    }

}
