package com.syntaxerror.security;

import com.syntaxerror.models.Client;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;

public class CustomClientDetails extends Client implements UserDetails {

    // <editor-fold defaultstate="collapsed" desc="Properties">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public CustomClientDetails (final Client client){
        super(client);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return super.getMagic();
    }

    @Override
    public String getUsername() {
        return super.getUser();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    // </editor-fold>

}
