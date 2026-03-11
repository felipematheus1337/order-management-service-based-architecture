package com.order.bff.presentation;

import com.order.bff.client.dtos.orders.OrderCreateDTO;
import com.order.bff.client.dtos.orders.OrderResponseDTO;
import com.order.bff.client.dtos.users.UserCreateDTO;
import com.order.bff.client.dtos.users.UserResponseDTO;
import com.order.bff.services.OrderService;
import com.order.bff.services.UserService;
import com.order.bff.wrapper.WrapperResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bff")
@RequiredArgsConstructor
public class BusinessController {

    private final UserService userService;
    private final OrderService orderService;

    @PostMapping("/users")
    public ResponseEntity<WrapperResponse<Void>> create(@RequestBody UserCreateDTO dto) {
        return ResponseEntity.ok(userService.create(dto));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<WrapperResponse<UserResponseDTO>> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.get(id));
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<OrderResponseDTO>> createOrder(@RequestBody OrderCreateDTO dto) {
        return ResponseEntity.ok(orderService.create(dto));
    }
}
