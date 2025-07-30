package com.example.market.domain.repository;

import com.example.market.domain.Product;
import com.example.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

  List<Product> getAll();

  Optional<List<Product>> getByCategory(Integer categoryId);

  Optional<List<Product>> getScarseProducts(int quantity);

  Optional<Product> getProduct(Long productId);

  Product save(Product product);

  void delete(Long productId);
}
