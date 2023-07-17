package com.example.swalayan.authentication;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AuthRequest {
    @NotNull @Length(min = 3, max = 20)
    private String username;

    @NotNull @Length(min = 5, max = 10)
    private String password;
}
