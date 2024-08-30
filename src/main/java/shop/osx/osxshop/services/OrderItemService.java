package shop.osx.osxshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import shop.osx.osxshop.models.OrderItem;
import shop.osx.osxshop.models.OrderItemId;
import shop.osx.osxshop.repositories.OrderItemRepository;

@Service
public class OrderItemService {
    // @Autowired
    // OrderItemRepository orderItemRepository;

    // @GetMapping
    // public ResponseEntity<List<OrderItem>> getAllOrderItems() {
    //     List<OrderItem> orders = orderItemRepository.findAll();
    //     return ResponseEntity.ok(orders);
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<OrderItem> getOrderItemById(OrderItemId id) {
    //     OrderItem orderItem = orderItemRepository.findById(id);
    //     return ResponseEntity.ok(orderItem);
    // }

    // @PostMapping
    // public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItem orderItem) {
    //     OrderItem newOrderItem = orderItemRepository.createOrderItem(orderItem);
    //     return ResponseEntity.ok(newOrderItem);
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<OrderItem> updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem) {
    //     OrderItem updatedOrderItem = orderItemRepository.updateOrderItem(id, orderItem);
    //     return ResponseEntity.ok(updatedOrderItem);
    // }

    // @DeleteMapping
    // public ResponseEntity<Void> delete(@PathVariable Long id) {
    //     orderItemRepository.deleteOrderItem(id);
    //     return ResponseEntity.noContent().build();
    // }
}
