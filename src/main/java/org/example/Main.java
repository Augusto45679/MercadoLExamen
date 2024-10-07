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

        };
    }
}