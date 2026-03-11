package com.orders.v1.infra.config;

import com.orders.v1.application.gateways.CreateOrderGateway;
import com.orders.v1.application.usecases.CreateOrderUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesBeanConfiguration {

    @Bean
    public CreateOrderUseCase createOrderUseCase(CreateOrderGateway gateway) {
        return new CreateOrderUseCase(gateway);
    }
}
