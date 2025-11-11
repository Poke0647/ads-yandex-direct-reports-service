package com.example.adsyandexdirectreportsservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Data
public class User implements GrantedAuthority {

    @Id
    private Long id;
    private String username;
    private String email;

    @Override
    public String getAuthority() {
        return "";
    }

    //check

}
