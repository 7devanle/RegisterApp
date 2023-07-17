package com.example.studentreg.registration;

import lombok.*;

@Getter @ToString @AllArgsConstructor @EqualsAndHashCode
public class RegistrationRequest {
    private final String name;
    private final String userName;
    private final String email;
    private final String password;

}
