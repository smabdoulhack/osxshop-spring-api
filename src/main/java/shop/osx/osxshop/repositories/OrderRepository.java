package shop.osx.osxshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.osx.osxshop.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
