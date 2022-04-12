package com.example.springproject.model;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student monu = new Student(
                    "Monu",
                    "monu@gmail.com",
                    LocalDate.of(2002, Month.NOVEMBER, 01)
            );

            Student alex = new Student(
              "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 06)
            );

            repository.saveAll(
                    List.of(monu, alex)
            );
        };
    }
}
