package com.orders.v1.infra.builder;

import com.orders.v1.domain.Order;
import com.orders.v1.infra.dtos.request.OrderRequest;
import com.orders.v1.infra.dtos.response.OrderResponse;
import org.springframework.stereotype.Component;

@Component
public class OrderBuilder {

    public Order toDomain(OrderRequest request) {
        return new Order(null, request.total(), request.userId(), null);
    }

    public OrderResponse toResponse(Order order) {
        return OrderResponse
                .builder()
                .id(order.getId())
                .userId(order.getUserId())
                .total(order.getTotal())
                .orderedAt(order.getOrderedAt())
                .build();
    }
}
