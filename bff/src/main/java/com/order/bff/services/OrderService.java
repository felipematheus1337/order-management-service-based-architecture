package com.order.bff.services;

import com.order.bff.client.OrdersClient;
import com.order.bff.client.dtos.orders.OrderCreateDTO;
import com.order.bff.client.dtos.orders.OrderResponseDTO;
import com.order.bff.utils.BusinessUtils;
import com.order.bff.wrapper.WrapperResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrdersClient client;
    private final BusinessUtils utils;

    public  WrapperResponse<OrderResponseDTO> create(OrderCreateDTO dto) {
        try {
            var responseEntity = client.create(dto);

            utils.validateResponseEntity(responseEntity);

            return WrapperResponse.<OrderResponseDTO>builder()
                    .status(HttpStatus.CREATED.value())
                    .message("Sucessfully created an order")
                    .payload(
                            responseEntity.getBody()
                    )
                    .build();
        } catch (Exception e) {
            return WrapperResponse.<OrderResponseDTO>builder()
                    .message(e.getMessage())
                    .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .payload(null)
                    .build();
        }
    }
}
