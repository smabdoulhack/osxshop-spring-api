package shop.osx.osxshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.osx.osxshop.models.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
    
}
