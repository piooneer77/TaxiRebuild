package com.syntaxerror.business;

import com.syntaxerror.models.Client;
import com.syntaxerror.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientBusiness {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private ClientRepository clientRepository;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public Client findClientByUserAndMagic(String user, String magic) {
        return clientRepository.findByUserAndMagic(user, magic);
    }
    // </editor-fold>

}
