package dev.deep.security.auth;

import dev.deep.security.user.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterRequest {

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Role role;
}
