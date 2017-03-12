package com.tcs.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.product.model.Product;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pr;

	public List<Product> getProducts(){
		List<Product> products = new ArrayList<Product>();
		Iterator<Product> productIterator = pr.findAll().iterator();
        	
        while(productIterator.hasNext()){
        	products.add(productIterator.next());
         }
		return products; 
	}
	 
	public Product getProduct(String id){
		
		//return getProducts().stream().filter(p -> p.getId().equals(id)).findFirst().get();// stream().filter(p -> p.getId().equals(id)).findFirst().get(); 
	return pr.findOne(id); //
	}
	
	public void addTopic(Product product){
		pr.save(product);
	}
	
	public void deleteTopic(String id){
		pr.delete(id);
		
	}

	public Product getProductByName(String name) {
		return pr.findByName(name);		 
	}
	
}
