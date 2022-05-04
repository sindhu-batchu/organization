package com.poc.organization.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Collection;
import java.util.Collections;

@Component
public class OrganizationAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken token = null;
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        //in realtime autheticate these against DB or any KMS
        boolean usernameValid = username.equals("user");
        boolean passwordValid = password.equals("password");

        if(usernameValid && passwordValid) {
            Collection<? extends GrantedAuthority> authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
            token = new UsernamePasswordAuthenticationToken(username, password, authorities);
            SecurityContextHolder.getContext().setAuthentication(token);
        }
        return token;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return !ObjectUtils.isEmpty(authentication) ? authentication.equals(UsernamePasswordAuthenticationToken.class) : false;
    }
}
