package com.syntaxerror.repositories;

import com.syntaxerror.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    Driver findByUser(String user);
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
