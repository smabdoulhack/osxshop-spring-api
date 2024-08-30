package shop.osx.osxshop.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemId implements Serializable {

    private Long orderId;
    private Long productId;

    // Getters, Setters, hashCode, equals
}
