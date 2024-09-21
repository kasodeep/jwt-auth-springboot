package dev.deep.security.auth;

import lombok.Builder;
import lombok.Data;

/**
 * This class objects are used to get api request.
 */
@Data
@Builder
public class AuthenticationRequest {

    private String email;

    private String password;
}
