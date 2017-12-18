package com.syntaxerror.repositories;

import com.syntaxerror.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    Client findByUserAndMagic(String user, String magic);

    Client findByUser(String user);
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
