package com.syntaxerror.services;

import com.syntaxerror.business.ClientBusiness;
import com.syntaxerror.encryption.SHA1;
import com.syntaxerror.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping(value = "/rest/client")
public class ClientService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private ClientBusiness clientBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    @GetMapping(value = "/login/{user}/{magic}", produces = {"application/json"})
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
