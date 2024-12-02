package com.ifsul.innovators.model;

import lombok.Data;

public @Data
class LoginRequest {
    private String email;
    private String senha;
}