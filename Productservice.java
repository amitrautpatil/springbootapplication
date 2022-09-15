package com.springset.springset.services;

import java.util.List;

import com.springset.springset.entity.product;

public interface Productservice {
       
	public List<product> getProducts();
	
	public product getProduct(long productId);
	
	public product addProduct(Product product);

	public product updateProduct(Product product);

	public product deleteProduct (long parseLong);

	
}
