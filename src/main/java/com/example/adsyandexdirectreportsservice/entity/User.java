package com.example.adsyandexdirectreportsservice.entity;

import org.springframework.security.core.GrantedAuthority;

public class User implements GrantedAuthority {

    private String username;
    private String email;

    @Override
    public String getAuthority() {
        return "";
    }
}
