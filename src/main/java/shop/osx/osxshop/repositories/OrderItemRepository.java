package shop.osx.osxshop.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import shop.osx.osxshop.models.OrderItem;
import shop.osx.osxshop.models.OrderItemId;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId>{

}
