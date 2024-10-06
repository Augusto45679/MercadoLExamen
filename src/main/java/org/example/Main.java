package org.example;

import jakarta.transaction.Transactional;
import org.example.entities.Mutant;
import org.example.repositories.MutantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Anda");
    }

    @Bean
    @Transactional
    CommandLineRunner init(MutantRepository mutantRepository) {
        return args -> {

            String[] notAnArray = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
            String[] notAnArray2 = {"ATGCGA","CAGTGC"};

            Mutant mutant = Mutant.builder().build();
            /*
                CASOS MUTANTES

                String[] dnaMutant1 = ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]; //true
                String[] dnaMutant2 = ["ATGCGA", "CAGTGC", "TTAAGT", "AGATGG", "CTCCTA", "TCACTG"];
                String[] dnaMutant3 = ["AAAAAA", "CTGAGA", "TTATGT", "AGACGG", "GCGTCA", "TCACTG"];
                String[] dnaMutant4 = ["ATGCGA", "CAGTGC", "TTAAGT", "AGATGG", "CTGCTA", "TCACTG"];
                String[] dnaMutant5 = ["ATGCGA", "CTGTGC", "TTGTGT", "AGTGGG", "CTCTTA", "TCACTG"];

                CASOS NO MUTANTES
                String[] dnaHuman1 = ["ATGCGA", "CAGTGC", "TTATGT", "AGACGG", "GCGTCA", "TCACTG"];
                String[] dnaHuman2 = ["ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG"];
                String[] dnaHuman3 = ["ATGCTA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG"];
                String[] dnaHuman4 = ["ATGCGA", "CATGGC", "TTATTT", "AGACGG", "CCGTCA", "TCACTG"];
                String[] dnaHuman5 = ["ATGCGA", "CAGTAC", "TTATTT", "AGTCGG", "GCGTCA", "TCACTG"];

            */

        };
    }
}