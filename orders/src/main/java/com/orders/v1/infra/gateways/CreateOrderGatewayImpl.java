package com.orders.v1.infra.gateways;

import com.orders.v1.application.gateways.CreateOrderGateway;
import com.orders.v1.domain.Order;
import com.orders.v1.infra.persistence.OrderEntity;
import com.orders.v1.infra.persistence.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
@Slf4j
public class CreateOrderGatewayImpl implements CreateOrderGateway {

    private final OrderRepository repository;

    @Transactional
    @Override
    public Order create(Order order) {

        log.info("::: Saving an order to the database. payload: {} ", order.toString());

        LocalDateTime orderedAt = LocalDateTime.now();

        var entity = OrderEntity
                .builder()
                .userId(order.getUserId())
                .total(order.getTotal())
                .orderedAt(orderedAt)
                .build();

        repository.save(entity);

        order.setId(entity.getId());
        order.setOrderedAt(orderedAt);

        return order;
    }
}
