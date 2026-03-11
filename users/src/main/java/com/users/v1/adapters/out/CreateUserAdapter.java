package com.users.v1.adapters.out;

import com.users.v1.adapters.out.builder.UserBuilder;
import com.users.v1.adapters.out.entity.UserEntity;
import com.users.v1.adapters.out.repository.UserEntityRepository;
import com.users.v1.application.domain.User;
import com.users.v1.application.ports.out.CreateUserOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserAdapter implements CreateUserOutputPort {

    private final UserEntityRepository repository;
    private final UserBuilder builder;

    @Override
    public void create(User user) {
        UserEntity entity = builder.toEntity(user);
        repository.save(entity);
    }
}
