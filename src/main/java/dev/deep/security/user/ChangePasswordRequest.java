package dev.deep.security.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
/*
* This class objects are used to get the api request.
* */
public class ChangePasswordRequest {

    private String currentPassword;

    private String newPassword;

    private String confirmationPassword;
}
