package com.users.v1.adapters.out.builder;

import com.users.v1.adapters.in.request.UserRequest;
import com.users.v1.adapters.in.response.UserResponse;
import com.users.v1.adapters.out.entity.UserEntity;
import com.users.v1.application.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserBuilder {

    public User toDomain(UserEntity userEntity) {
        return User
                .builder()
                .id(userEntity.getId())
                .cpf(userEntity.getCpf())
                .email(userEntity.getEmail())
                .createdAt(userEntity.getCreatedAt())
                .name(userEntity.getName())
                .build();
    }

    public UserEntity toEntity(User user) {
        return UserEntity
                .builder()
                .cpf(user.getCpf())
                .id(user.getId())
                .createdAt(user.getCreatedAt())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }

    public User requestToDomain(UserRequest request) {
        return User
                .builder()
                .id(null)
                .cpf(request.cpf())
                .email(request.email())
                .createdAt(null)
                .name(request.name())
                .build();
    }

    public UserResponse toResponse(User user) {
        return UserResponse
                .builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt())
                .build();
    }
}
