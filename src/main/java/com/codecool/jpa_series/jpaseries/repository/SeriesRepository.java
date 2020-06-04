package com.codecool.jpa_series.jpaseries.repository;

import com.codecool.jpa_series.jpaseries.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
