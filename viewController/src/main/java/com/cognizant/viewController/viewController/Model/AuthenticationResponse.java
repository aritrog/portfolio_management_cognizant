package com.cognizant.viewController.viewController.Model;

public class AuthenticationResponse {
    
    private String authToken;
    private boolean valid;

    @Override
    public String toString(){
        return "AuthorizationClient [authToken=" + authToken + ", valid=" + valid + "]";
    }
}
