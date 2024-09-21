package dev.deep.security.auth;

import dev.deep.security.user.Role;
import lombok.Builder;
import lombok.Data;

/**
 * This class objects are used to get api request to register the user.
 */
@Data
@Builder
public class RegisterRequest {

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Role role;
}
