package dev.deep.security.user;

import lombok.Builder;
import lombok.Data;

/**
 * This class objects are used to get the api request.
 */
@Data
@Builder
public class ChangePasswordRequest {

    private String currentPassword;

    private String newPassword;

    private String confirmationPassword;
}
