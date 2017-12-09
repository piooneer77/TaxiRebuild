package com.syntaxerror.repositories;

import com.syntaxerror.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer>{
}
