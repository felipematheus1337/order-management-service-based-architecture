package com.users.v1.adapters.in.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserResponse(Long id, String name, String email, LocalDateTime createdAt) {
}
