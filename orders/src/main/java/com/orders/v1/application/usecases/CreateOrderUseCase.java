package com.orders.v1.application.usecases;

import com.orders.v1.application.exceptions.UseCaseException;
import com.orders.v1.application.gateways.CreateOrderGateway;
import com.orders.v1.domain.Order;

public class CreateOrderUseCase {

    private final CreateOrderGateway createOrderGateway;

    public CreateOrderUseCase(CreateOrderGateway createOrderGateway) {
        this.createOrderGateway = createOrderGateway;
    }

    public Order executar(Order order) {
        boolean isValid = order.validate();
        if (!isValid) throw new UseCaseException("Order not valid, check the payload.");
        return createOrderGateway.create(order);
    }
}
