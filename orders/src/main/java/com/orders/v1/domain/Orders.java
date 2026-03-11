package com.orders.v1.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orders {

    private Long id;

    private BigDecimal total;

    private Long userId;

    private LocalDateTime orderedAt;

    public Orders() {
    }

    public Orders(Long id, BigDecimal total, Long userId, LocalDateTime orderedAt) {
        this.id = id;
        this.total = total;
        this.userId = userId;
        this.orderedAt = orderedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }
}
