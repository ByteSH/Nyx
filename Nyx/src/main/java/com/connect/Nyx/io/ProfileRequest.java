package com.connect.Nyx.io;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequest {

    @NotBlank(message = "Name should not be blank.")
    private String name;

    @Email(message = "Enter valid email address")
    @NotNull(message = "Entry should no be null.")
    private String email;

    @Size(min = 6, message = "Password must contains 6 characters")
    private String password;
}