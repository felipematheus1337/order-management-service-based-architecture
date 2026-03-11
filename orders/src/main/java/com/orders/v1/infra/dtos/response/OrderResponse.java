package com.orders.v1.infra.dtos.response;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record OrderResponse(Long id, Long userId, BigDecimal total, LocalDateTime orderedAt) {
}
