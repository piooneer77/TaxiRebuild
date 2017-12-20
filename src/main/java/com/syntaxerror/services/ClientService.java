package com.syntaxerror.services;

import com.syntaxerror.business.ClientBusiness;
import com.syntaxerror.encryption.SHA1;
import com.syntaxerror.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private ClientBusiness clientBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    @GetMapping(value = "/secure/all")
    public ResponseEntity<List<Client>> getAllClients(){
        return new ResponseEntity<List<Client>>(clientBusiness.getAllClients(), HttpStatus.OK);
    }

    @GetMapping(value = "/secure/login/{user}/{magic}", produces = {"application/json"})
    public ResponseEntity<Client> Login(@PathVariable String user, @PathVariable String magic) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return new ResponseEntity<Client>(getClientObjectFromBusinessLayer(user, magic), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">
    private Client getClientObjectFromBusinessLayer(String user, String magic) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return clientBusiness.findClientByUserAndMagic(user, magic);
    }

    private String encryptedMagic(String magic) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return SHA1.encryptPassword(magic);
    }
    // </editor-fold>

}
