package com.syntaxerror.repositories;

import com.syntaxerror.models.TripLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripLocationRepository extends JpaRepository<TripLocation, Integer> {
}
