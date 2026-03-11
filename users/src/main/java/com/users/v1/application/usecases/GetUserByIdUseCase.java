package com.users.v1.application.usecases;

import com.users.v1.application.domain.User;
import com.users.v1.application.ports.in.GetUserByIdInputPort;
import com.users.v1.application.ports.out.GetUserByIdOutputPort;

public class GetUserByIdUseCase implements GetUserByIdInputPort {

    private final GetUserByIdOutputPort getUserByIdOutputPort;

    public GetUserByIdUseCase(GetUserByIdOutputPort getUserByIdOutputPort) {
        this.getUserByIdOutputPort = getUserByIdOutputPort;
    }

    @Override
    public User get(Long id) {
        return getUserByIdOutputPort.get(id);
    }
}
