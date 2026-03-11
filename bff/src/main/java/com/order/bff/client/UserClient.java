package com.order.bff.client;

import com.order.bff.client.dtos.users.UserCreateDTO;
import com.order.bff.client.dtos.users.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "userClient", url = "${clients.users.url}")
public interface UserClient {


    @PostMapping
    ResponseEntity<Void> create(@RequestBody UserCreateDTO dto);

    @GetMapping("/{id}")
    ResponseEntity<UserResponseDTO> get(@PathVariable Long id);
}
