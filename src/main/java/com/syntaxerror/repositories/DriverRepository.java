package com.syntaxerror.repositories;

import com.syntaxerror.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer>{
}
