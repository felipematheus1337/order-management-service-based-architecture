package com.order.bff.services;

import com.order.bff.client.UserClient;
import com.order.bff.client.dtos.users.UserCreateDTO;
import com.order.bff.client.dtos.users.UserResponseDTO;
import com.order.bff.utils.BusinessUtils;
import com.order.bff.wrapper.WrapperResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserClient client;
    private final BusinessUtils utils;

    public  WrapperResponse<Void> create(UserCreateDTO dto) {
        try {
            var response = client.create(dto);

            utils.validateResponseEntity(response);

            return
                    WrapperResponse.<Void>builder()
                            .status(HttpStatus.CREATED.value())
                            .message("Sucessfully Created.")
                            .payload(null)
                            .build();
        } catch (Exception e) {
            return WrapperResponse.<Void>builder()
                    .message(e.getMessage())
                    .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .build();
        }
    }

    public WrapperResponse<UserResponseDTO> get(Long id) {
        try {
            var responseEntity = client.get(id);
            utils.validateResponseEntity(responseEntity);

            return WrapperResponse.<UserResponseDTO>builder()
                    .status(HttpStatus.NO_CONTENT.value())
                    .message("Sucessfully found an user")
                    .payload(
                            responseEntity.getBody()
                    )
                    .build();
        } catch (Exception e) {
            return WrapperResponse.<UserResponseDTO>builder()
                    .message(e.getMessage())
                    .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .payload(null)
                    .build();
        }
    }



}
