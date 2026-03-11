package com.users.v1.adapters.out;

import com.users.v1.adapters.out.repository.UserEntityRepository;
import com.users.v1.application.ports.out.ExistsUserByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExistsUserByIdAdapter implements ExistsUserByIdOutputPort {

    private final UserEntityRepository repository;

    @Override
    public boolean execute(Long id) {
        return repository.existsById(id);
    }
}
