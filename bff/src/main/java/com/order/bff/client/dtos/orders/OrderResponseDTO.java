package com.order.bff.client.dtos.orders;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record OrderResponseDTO(Long id, Long userId, BigDecimal total, LocalDateTime orderedAt) {
}
