package com.order.bff.client.dtos.users;

import lombok.Builder;

@Builder
public record UserCreateDTO(String cpf, String email, String name) {
}
