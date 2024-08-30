package shop.osx.osxshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import shop.osx.osxshop.models.Product;
import shop.osx.osxshop.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(Long id) {
        Product user = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return user;
    }

    @PostMapping
    public Product createProduct(Product user) {
        Product newProduct = productRepository.save(user);
        return newProduct;
    }

    @PutMapping("/{id}")
    public Product updateProduct(Long id, Product user) {
        Product updatedProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        updatedProduct.setName(user.getName());
        updatedProduct.setCategories(user.getCategories());
        updatedProduct.setDescription(user.getDescription());
        updatedProduct.setPrice(user.getPrice());
        updatedProduct.setStockQty(user.getStockQty());
        return updatedProduct;
    }

    @DeleteMapping
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
