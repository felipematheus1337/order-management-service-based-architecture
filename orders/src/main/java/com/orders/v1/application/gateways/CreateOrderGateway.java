package com.orders.v1.application.gateways;

import com.orders.v1.domain.Order;

public interface CreateOrderGateway {

    Order create(Order order);
}
