package com.digisafari.service;

import java.util.List;

import com.digisafari.exception.ProductAlreadyExistsException;
import com.digisafari.exception.ProductNotFoundException;
import com.digisafari.model.Product;

public interface IProductService {
	
	public List<Product> getAllProducts();
	public Product getProductById(int id) throws ProductNotFoundException;
	public Product addProductToList(Product product) throws ProductAlreadyExistsException;
	public String deleteProduct(int id) throws ProductNotFoundException, ProductAlreadyExistsException;
	public Product updateProduct(Product product) throws ProductNotFoundException;
	public List<Product> getAllProductsByCategory(String category) throws ProductNotFoundException;
	//list of all products
			//list specific product based on id
			//list all products price > x
			//list products available
			//list products based on category
			// sort products based on name
			// sort products based on rating
	public List<Product> getProductsAbovePrice(double price) throws ProductNotFoundException;
	public List<Product> sortProductByRating() throws ProductNotFoundException;
	public List<Product> sortProductByName() throws ProductNotFoundException;

}
