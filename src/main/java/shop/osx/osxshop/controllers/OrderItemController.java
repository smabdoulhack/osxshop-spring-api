package shop.osx.osxshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.osx.osxshop.models.OrderItem;
import shop.osx.osxshop.models.OrderItemId;
import shop.osx.osxshop.repositories.OrderItemRepository;

@RestController
@RequestMapping("/api/order_items")
public class OrderItemController {
     @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping
    public List<OrderItem> getAllOrders() {
        return orderItemRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> getOrderById(@PathVariable OrderItemId id) {
        OrderItem user = orderItemRepository.findById(id).orElseThrow(() -> new RuntimeException("Order's item not found"));
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<OrderItem> createOrder(@RequestBody OrderItem user) {
        OrderItem newOrder = orderItemRepository.save(user);
        return ResponseEntity.ok(newOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItem> updateOrder(@PathVariable OrderItemId id, @RequestBody OrderItem user) {
        OrderItem updatedOrder = orderItemRepository.findById(id).orElseThrow(() -> new RuntimeException("Order's item not found"));
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable OrderItemId id) {
        orderItemRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
