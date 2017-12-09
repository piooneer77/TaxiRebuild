package com.syntaxerror.repositories;

import com.syntaxerror.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer>{
}
