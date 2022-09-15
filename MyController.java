package com.springset.springset.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springset.springset.services.Productservice;

@RestController
public class MyController<Product> {
	
	@Autowired
	private Productservice productService;

    @GetMapping("/product")	
	public String product()  {
		return "this is product";
	}
    //get the products
    
    @GetMapping("/products")
    public  List<Product> getProducts()
    {
     return (List<Product>) this.productService.getProducts();
	
    }
    @GetMapping("/products/{productId}")
  public Product getProduct(@PathVariable String productId)
  {
   return (Product) this.productService.getProduct(Long.parseLong(productId));
}
    @PostMapping("/products")
    public Product addProduct(@RequestBody com.springset.springset.entity.Product product)
    {
    	return (Product) this.productService.addProduct(product);
    }
    
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product)
    {
        return this.productService.updateProduct(product);
    }
    @DeleteMapping("/products/{productId}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId)
   try {
         this.productService.deleteProduct(Long.parseLong(productId));
         return new ResponseEntity<>(HttpStatus.ok);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

