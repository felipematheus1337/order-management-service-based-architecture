package com.users.v1.adapters.in;

import com.users.v1.adapters.in.request.UserRequest;
import com.users.v1.adapters.out.builder.UserBuilder;
import com.users.v1.application.domain.User;
import com.users.v1.application.ports.in.CreateUserInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserInputPort createUserInputPort;
    private final UserBuilder builder;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody UserRequest request) {

        User user = builder.requestToDomain(request);

        createUserInputPort.create(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
