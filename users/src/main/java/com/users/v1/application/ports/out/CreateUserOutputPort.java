package com.users.v1.application.ports.out;

import com.users.v1.application.domain.User;

public interface CreateUserOutputPort {

    void create(User user);
}
