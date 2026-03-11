package com.orders.v1.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userClient", url = "${client.user.url}")
public interface UserClient {

    @GetMapping(value = "/exists/{id}")
    ResponseEntity<Boolean> existsById(@PathVariable("id") Long id);
}
