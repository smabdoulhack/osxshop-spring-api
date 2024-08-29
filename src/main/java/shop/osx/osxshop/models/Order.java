package shop.osx.osxshop.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Double totalAmount;
    private String status;

    @Column(nullable = false)
    private LocalDateTime createdAt;
    
    @Column(updatable = false)
    private LocalDateTime updatedAt;
}
