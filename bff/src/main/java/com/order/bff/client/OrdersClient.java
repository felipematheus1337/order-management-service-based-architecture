package com.order.bff.client;

import com.order.bff.client.dtos.orders.OrderCreateDTO;
import com.order.bff.client.dtos.orders.OrderResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ordersClient", url = "${clients.orders.url}")
public interface OrdersClient {

    @PostMapping
    ResponseEntity<OrderResponseDTO> create(@RequestBody OrderCreateDTO dto);
}
