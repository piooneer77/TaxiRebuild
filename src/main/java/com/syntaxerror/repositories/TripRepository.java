package com.syntaxerror.repositories;

import com.syntaxerror.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
