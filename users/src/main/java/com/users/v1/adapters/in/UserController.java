package com.users.v1.adapters.in;

import com.users.v1.adapters.in.request.UserRequest;
import com.users.v1.adapters.in.response.UserResponse;
import com.users.v1.adapters.out.builder.UserBuilder;
import com.users.v1.application.domain.User;
import com.users.v1.application.ports.in.CreateUserInputPort;
import com.users.v1.application.ports.in.ExistsUserByIdInputPort;
import com.users.v1.application.ports.in.GetUserByIdInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserInputPort createUserInputPort;
    private final GetUserByIdInputPort getUserByIdInputPort;
    private final ExistsUserByIdInputPort existsUserByIdInputPort;
    private final UserBuilder builder;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody UserRequest request) {

        User user = builder.requestToDomain(request);

        createUserInputPort.create(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> get(@PathVariable("id") Long id) {
        UserResponse response = builder.toResponse(getUserByIdInputPort.get(id));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(existsUserByIdInputPort.execute(id));

    }
}
