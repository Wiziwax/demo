package com.example.demo.Student;

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

            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)

            );

            Student alex = new Student(
                    "Alexis",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 7)

            );

            Student alexis = new Student(
                    "Alam",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 7)

            );

            Student stark = new Student(
                    "Thanos",
                    "stark.thanos@gmail.com",
                    LocalDate.of(2001, Month.MARCH, 9)

            );

            Student wizzy = new Student(
                    "rogers",
                    "thor.thanos@gmail.com",
                    LocalDate.of(2001, Month.MARCH, 9)

            );
            repository.saveAll(
                    List.of(mariam, alex, alexis, stark, wizzy)
            );
        };
    }
}
