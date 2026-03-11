package com.order.bff.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class BusinessUtils {

    public void validateResponseEntity(ResponseEntity response) {
        if (
                response == null ||
                        response.getBody() == null
                        || response.getStatusCode().is4xxClientError() ||
                        response.getStatusCode().is5xxServerError()
        )  throw new RuntimeException("Error");
    }
}
