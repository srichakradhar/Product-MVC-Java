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
	}
	
	
	//CRUD
	public List<Product> getProductsList(){
		return this.productsList;
	}
	
	public Product addProductToList(Product product) throws ProductAlreadyExistsException{
		
		//check if the product is already existing in the list
		//if yes throw ProductAlreadyExistsException
		this.productsList.add(product);
		return product;
	}

}
