package com.users.v1.application.usecases;

import com.users.v1.application.domain.User;
import com.users.v1.application.ports.in.CreateUserInputPort;
import com.users.v1.application.ports.out.CreateUserOutputPort;

import java.time.LocalDateTime;

public class CreateUserUseCase implements CreateUserInputPort {

    private final CreateUserOutputPort createUserOutputPort;

    public CreateUserUseCase(CreateUserOutputPort createUserOutputPort) {
        this.createUserOutputPort = createUserOutputPort;
    }

    @Override
    public void create(User user) {
       boolean isValid =  user.validate();
       user.setCreatedAt(LocalDateTime.now());
       createUserOutputPort.create(user);
    }
}
