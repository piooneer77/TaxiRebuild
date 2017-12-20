package com.syntaxerror.security;

import com.syntaxerror.models.Client;
import com.syntaxerror.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomClientDetailsService implements UserDetailsService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private ClientRepository clientRepository;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        Client client = clientRepository.findByUser(user);
        if (client != null) {
            return new CustomClientDetails(client);
        } else {
            throw new UsernameNotFoundException("Invalid Username or Password");
        }
    }
    // </editor-fold>

}
