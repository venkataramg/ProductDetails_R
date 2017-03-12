package com.tcs.product;

import org.springframework.data.repository.CrudRepository;

import com.tcs.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

	public Product findByName(String name);
}
