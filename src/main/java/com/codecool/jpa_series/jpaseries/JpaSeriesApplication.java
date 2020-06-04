package com.codecool.jpa_series.jpaseries;

import com.codecool.jpa_series.jpaseries.entity.Series;
import com.codecool.jpa_series.jpaseries.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@SpringBootApplication
public class JpaSeriesApplication {

    @Autowired
    SeriesRepository seriesRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaSeriesApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {
            Series rick_and_morty = Series.builder()
                    .name("Rick and Morty")
                    .averageRating(9.2F)
                    .releaseDate(LocalDate.of(2013, 12, 2))
                    .build();
            seriesRepository.save(rick_and_morty);
        };
    }

}
