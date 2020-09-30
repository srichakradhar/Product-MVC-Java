package com.digisafari.service;

import java.util.List;

import com.digisafari.exception.ProductAlreadyExistsException;
import com.digisafari.exception.ProductNotFoundException;
import com.digisafari.model.Product;
import com.digisafari.repository.ProductRepository;

public class ProductService implements IProductService {
	
	ProductRepository repository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repository.getProductsList();
	}

	@Override
	public Product getProductById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProductToList(Product product) throws ProductAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
