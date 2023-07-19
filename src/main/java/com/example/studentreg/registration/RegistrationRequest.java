package com.example.studentreg.registration;

import lombok.*;

@Getter @ToString @AllArgsConstructor @EqualsAndHashCode
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

}
