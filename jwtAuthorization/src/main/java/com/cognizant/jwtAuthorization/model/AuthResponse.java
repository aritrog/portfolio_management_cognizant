package com.cognizant.jwtAuthorization.model;

import lombok.Data;

@Data
public class AuthResponse {
    
    private String name;
    private String uid;
    private boolean isValid;
}
