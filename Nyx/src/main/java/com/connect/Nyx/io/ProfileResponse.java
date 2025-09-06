package com.connect.Nyx.io;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileResponse {

    @Column(unique = true)
    private String userId;
    private String name;
    private String email;
    private Boolean isAccountVerified;
}