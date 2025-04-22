package dev.deep.security.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

/**
 * This class objects are used to get the api request.
 */
@Data
@Builder
public class ChangePasswordRequest {

    @NotBlank
    private String currentPassword;

    private String newPassword;

    private String confirmationPassword;
}
