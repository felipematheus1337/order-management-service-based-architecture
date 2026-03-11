package com.users.v1.application.ports.out;

public interface ExistsUserByIdOutputPort {

    boolean execute(Long id);
}
