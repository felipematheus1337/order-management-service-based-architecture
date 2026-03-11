package com.orders.v1.infra.presentation;

import com.orders.v1.application.usecases.CreateOrderUseCase;
import com.orders.v1.domain.Order;
import com.orders.v1.infra.builder.OrderBuilder;
import com.orders.v1.infra.dtos.request.OrderRequest;
import com.orders.v1.infra.dtos.response.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final CreateOrderUseCase createOrderUseCase;
    private final OrderBuilder builder;

    @PostMapping
    public ResponseEntity<OrderResponse> create(@RequestBody OrderRequest request) {
        Order order = builder.toDomain(request);
        var response = builder.toResponse(createOrderUseCase.executar(order));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

}
