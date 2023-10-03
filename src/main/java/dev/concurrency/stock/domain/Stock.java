package dev.concurrency.stock.domain;


import jakarta.persistence.Entity;

@Entity
public class Stock {
    private Long id;
    private Long productId;
    private Long quantity;

    public Stock() {
    }

    public Stock(Long productId, Long quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }
}
