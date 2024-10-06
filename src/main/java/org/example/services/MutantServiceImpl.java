package org.example.services;

import org.example.entities.MutantStats;
import org.example.entities.Mutant;
import org.example.repositories.BaseRepository;
import org.example.repositories.MutantRepository;
import org.example.repositories.MutantStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MutantServiceImpl extends BaseServiceImpl<Mutant,Long> {

    @Autowired
    private MutantRepository mutantRepository;

    @Autowired
    private MutantStatsRepository mutantStatsRepository;

    public MutantServiceImpl(BaseRepository<Mutant, Long> baseRepository) {
        super(baseRepository);
    }

    private int contadorSecuencias;
    private int mutantCounter;
    private int humanCounter;
    public Boolean isMutant(String[] dna) {
            contadorSecuencias=0;
             mutantCounter = 0;
             humanCounter = 0;

        int n = dna.length;
        if(n== 0 || dna[0].isEmpty()){
            throw new IllegalArgumentException("La cadena es vacia. Ingrese una cadena con caracteres válidos");
        }

        for (String str : dna) {
            for (char c : str.toCharArray()) {
                if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
                    throw new IllegalArgumentException("Secuencia no valida.Las letras permitidas son A T G C ");
                }
            }
        }

            contadorSecuencias += checkHorizontal(dna,n);
            contadorSecuencias += checkVertical(dna,n);
            contadorSecuencias += checkDiagonal(dna,n);
            humanCounter = n - contadorSecuencias;
            mutantCounter = contadorSecuencias;
            boolean isMutant = contadorSecuencias >= 1;
            if(isMutant){
                Mutant mutant = Mutant.builder().build();
                mutant.setSequence(String.join(",", dna));
                mutant.setEsMutante(isMutant);
                mutantRepository.save(mutant);
                MutantStats mutantStats = new MutantStats(mutantCounter,humanCounter,(double) mutantCounter/humanCounter);
                mutantStatsRepository.save(mutantStats);
            }
        return isMutant;
    }

    private int checkHorizontal(String[] dna, int n) {
        int secuencias = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if (dna[i].charAt(j) == dna[i].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 3)) {
                    secuencias++;
                }
            }
        }
        contadorSecuencias += secuencias;
        return secuencias;
    }

    private int checkVertical(String[] dna, int n) {
        int secuencias = 0;
        for (int i = 0; i <= n - 4; i++) {
            for (int k = 0; k < n; k++) {
                if (dna[i].charAt(k) == dna[i + 1].charAt(k) &&
                        dna[i].charAt(k) == dna[i + 2].charAt(k) &&
                        dna[i].charAt(k) == dna[i + 3].charAt(k)) {
                    secuencias++;
                }
            }
        }
        contadorSecuencias += secuencias;
        return secuencias;
    }

    private int checkDiagonal(String[] dna, int n) {
        int secuencias = 0;
        // Diagonal ascendente (izquierda a derecha, abajo a arriba)
        for (int i = 0; i <= n - 4; i++) {
            for (int t = 0; t <= n - 4; t++) {
                if (dna[i].charAt(t) == dna[i + 1].charAt(t + 1) &&
                        dna[i].charAt(t) == dna[i + 2].charAt(t + 2) &&
                        dna[i].charAt(t) == dna[i + 3].charAt(t + 3)) {
                    secuencias++;
                }
            }
        }
        // Diagonal descendente (izquierda a derecha, arriba a abajo)
        for (int i = 3; i < n; i++) {
            for (int t = 0; t <= n - 4; t++) {
                if (dna[i].charAt(t) == dna[i - 1].charAt(t + 1) &&
                        dna[i].charAt(t) == dna[i - 2].charAt(t + 2) &&
                        dna[i].charAt(t) == dna[i - 3].charAt(t + 3)) {
                    secuencias++;
                }
            }
        }
        // Contabilizar las secuencias diagonales encontradas
        contadorSecuencias += secuencias;
        return secuencias;
    }

}
