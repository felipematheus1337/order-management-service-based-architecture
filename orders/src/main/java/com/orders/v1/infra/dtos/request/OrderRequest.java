package com.orders.v1.infra.dtos.request;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record OrderRequest(Long userId, BigDecimal total) {
}
