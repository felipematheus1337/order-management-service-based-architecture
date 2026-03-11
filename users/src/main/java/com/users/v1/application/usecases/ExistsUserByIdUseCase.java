package com.users.v1.application.usecases;

import com.users.v1.application.ports.in.ExistsUserByIdInputPort;
import com.users.v1.application.ports.out.ExistsUserByIdOutputPort;

public class ExistsUserByIdUseCase implements ExistsUserByIdInputPort {

    private final ExistsUserByIdOutputPort existsUserByIdOutputPort;

    public ExistsUserByIdUseCase(ExistsUserByIdOutputPort existsUserByIdOutputPort) {
        this.existsUserByIdOutputPort = existsUserByIdOutputPort;
    }

    @Override
    public boolean execute(Long id) {
        return existsUserByIdOutputPort.execute(id);
    }
}
