package com.syntaxerror.repositories;

import com.syntaxerror.models.ClientsSharingTheTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsSharingTheTripRepository extends JpaRepository<ClientsSharingTheTrip, Integer> {
}
