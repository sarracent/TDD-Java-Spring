package com.marketplace.products.repositories;

import com.marketplace.products.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findProductById(Integer id);
    Product findProductByIdAndName(Integer id, String name);
}
