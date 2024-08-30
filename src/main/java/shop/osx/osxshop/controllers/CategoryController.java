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

import shop.osx.osxshop.models.Category;
import shop.osx.osxshop.repositories.CategoryRepository;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    // @Autowired
    // private CategoryRepository categoryRepository;

    // @GetMapping
    // public List<Category> getAllCategorys() {
    //     return categoryRepository.findAll();
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
    //     Category user = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    //     return ResponseEntity.ok(user);
    // }

    // @PostMapping
    // public ResponseEntity<Category> createCategory(@RequestBody Category user) {
    //     Category newCategory = categoryRepository.save(user);
    //     return ResponseEntity.ok(newCategory);
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category user) {
    //     Category updatedCategory = categoryRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("Category not found"));
    //     updatedCategory.setName(user.getName());
    //     return ResponseEntity.ok(updatedCategory);
    // }

    // @DeleteMapping
    // public ResponseEntity<Void> delete(@PathVariable Long id) {
    //     categoryRepository.deleteById(id);
    //     return ResponseEntity.noContent().build();
    // }
}
