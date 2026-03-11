package com.order.bff.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WrapperResponse<T> {

    private int status;
    private String message;
    private T payload;
}
