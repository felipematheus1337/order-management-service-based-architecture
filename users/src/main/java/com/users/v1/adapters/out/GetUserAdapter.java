package com.users.v1.adapters.out;

import com.users.v1.adapters.exception.BusinessException;
import com.users.v1.adapters.out.builder.UserBuilder;
import com.users.v1.adapters.out.entity.UserEntity;
import com.users.v1.adapters.out.repository.UserEntityRepository;
import com.users.v1.application.domain.User;
import com.users.v1.application.ports.out.GetUserByIdOutputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
@Slf4j
public class GetUserAdapter implements GetUserByIdOutputPort {

    private final UserEntityRepository repository;
    private final UserBuilder builder;

    @Override
    public User get(Long id) {
        log.info("::: Searching user by id: {} ", id);
        Optional<UserEntity> optUser = repository.findById(id);
        if (optUser.isEmpty()) throw new BusinessException("User not found.");
        return builder.toDomain(optUser.get());
    }


}
