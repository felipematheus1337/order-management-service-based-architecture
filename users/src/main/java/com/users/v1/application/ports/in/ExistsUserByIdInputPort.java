package com.users.v1.application.ports.in;

public interface ExistsUserByIdInputPort {

    boolean execute(Long id);
}
