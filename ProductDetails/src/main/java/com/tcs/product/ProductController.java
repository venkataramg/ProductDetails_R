package com.tcs.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.product.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@RequestMapping("/products")
	public List<Product> getMessage(){
		return ps.getProducts();
	}
	
	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable String id){
		return ps.getProduct(id);		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addTopic(@RequestBody Product product){
		ps.addTopic(product);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
	public void deleteTopic(@PathVariable String id){
		ps.deleteTopic(id);;
	}
	
	@RequestMapping("/productsByName/{name}")
	public Product getProductByName(@PathVariable String name){
		return ps.getProductByName(name);		
	}
}



