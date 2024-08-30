package shop.osx.osxshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.osx.osxshop.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
