package com.order.bff.client.dtos.orders;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record OrderCreateDTO(Long userId, BigDecimal total) {
}
