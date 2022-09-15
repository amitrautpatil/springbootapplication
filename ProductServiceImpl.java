package com.springset.springset.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springset.springset.entity.product;

@Service
public class ProductServiceImpl<Product> implements Productservice {
	
	List<product> list;
	
	public  ProductServiceImpl() {
		
		list=new ArrayList<>();
	    list.add(new product(1001,"lenovo yoga","laptop","electronics",45000,120,180,300,45000 ));
		list.add(new product(1002,"LG Washing machine","Washing Machine","Home Appliences",60000,1200,1450,800,58150));
		list.add(new product (1003,"HP pavilion laptop","laptop","electronics",60000,9000,10800,00,61800));
		list.add(new product (1004,"us polo assan","Tshirt","Clothing",1200,480,144,866, 0));
		list.add(new product(1005,"neelkamal been bag","sofa set","furniture",350,45,20,30,355));
	}
	
 @Override
	public List<product> getProducts() {
		
		return list;
	}

@Override
public product getProduct(long productId) {
	
	product p=null;
	for(product product:list)
	{
		if (product.getId()==productId)
		{
			p=product;
			break;
		}
	}
	return p;
}

@Override
public product addProduct(product product) {
    list.add(product);
	return product;
}
@Override
 public Product updateProduct(Product product)
 {
   list.forEach(e ->{
	if (e.getId()== product.getId()){
		e.setName(product.getName());
		e.setType(product.getType());
		e.setCategory(product.getCategory());
		e.setPrice(product.getPrice());
		e.setDiscount(product.getDiscount());
		e.setGst(product.getGst());
		e.setFinalprice(product.getFinalprice());

 }
 });
return product;

 }
 @Override
 public void deleteProduct(long parseLong)
 {
	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.tolist()
 }

}	
