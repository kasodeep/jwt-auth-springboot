package dev.deep.security.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
/*
 * This class objects are used to get api request.
 * */
public class AuthenticationRequest {

    private String email;

    private String password;
}
