package com.digisafari.repository;

import java.util.List;

import com.digisafari.exception.ProductAlreadyExistsException;
import com.digisafari.model.Product;
import com.digisafari.util.Utils;

public class ProductRepository {
	List<Product> productsList;
	Utils utils;
	
	public ProductRepository() {
		this.utils = new Utils();
		productsList = this.utils.createProductListFromCsv();
		Product product = new Product();
		product.setProductName("Rexona");
		product.setCategory("Soap");
		product.setPrice("30");
		productsList.add(product);
	}
	
	//CRUD
	public List<Product> getProductsList(){
		return this.productsList;
	}
	
	public Product addProductToList(Product product) throws ProductAlreadyExistsException{
		
		//check if the product is already existing in the list
		//if yes throw ProductAlreadyExistsException
		for(Product p: productsList) {
			if(p.id == product.id) {
				throw new ProductAlreadyExistsException();
			}else{
				this.productsList.add(product);
			}
		}
		return product;
	}

	public boolean removeProduct(int id) throws ProductAlreadyExistsException{
		List<Product> tempProductsList = new ArrayList<Product>();
		
		for(Product p: productsList) {
			if(p.id == product.id) {
				continue;
			}else{
				tempProductsList.add(p);
			}
		}

		productsList = tempProductsList;
		if(productsList.size() == tempProductsList.size()) {
			throw new ProductNotFoundException();
			return false;
		}
		
		return true;
	}

}
