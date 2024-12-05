package com.ifsul.innovators.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private UserDetails userDetails;
}