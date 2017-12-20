package com.syntaxerror.security;

import com.syntaxerror.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = ClientRepository.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private CustomClientDetailsService customClientDetailsService;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customClientDetailsService);
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("**/secure/**").authenticated()
                .anyRequest()
                .fullyAuthenticated()
                .and().httpBasic();
        httpSecurity.csrf().disable();
    }
    // </editor-fold>

}

