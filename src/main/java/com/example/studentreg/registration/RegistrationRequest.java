package com.example.studentreg.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

}
