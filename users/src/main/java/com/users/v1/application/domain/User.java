package com.users.v1.application.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;
    private String email;
    private String cpf;
    private LocalDateTime createdAt;

    public boolean validate() {

        if (email == null || email.isBlank()) return false;

        if (name == null || name.isBlank()) return false;

        return cpf != null && !cpf.isBlank();
    }
}
