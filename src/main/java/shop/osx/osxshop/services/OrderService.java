package shop.osx.osxshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.osx.osxshop.models.Order;
import shop.osx.osxshop.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        return order;
    }

    public Order createOrder(Order order) {
        Order newOrder = orderRepository.save(order);
        return newOrder;
    }

    public Order updateOrder(Long id, Order order) {
        Order updatedOrder = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        updatedOrder.setUser(order.getUser());
        updatedOrder.setStatus(order.getStatus());
        updatedOrder.setTotalAmount(order.getTotalAmount());
        return updatedOrder;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
