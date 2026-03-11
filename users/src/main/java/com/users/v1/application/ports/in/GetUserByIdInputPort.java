package com.users.v1.application.ports.in;

import com.users.v1.application.domain.User;

public interface GetUserByIdInputPort {

    User get(Long id);
}
