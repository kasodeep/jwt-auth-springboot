package dev.deep.security.auth;

import dev.deep.security.user.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
/*
* This class objects are used to get api request to register the user.
* */
public class RegisterRequest {

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Role role;
}
