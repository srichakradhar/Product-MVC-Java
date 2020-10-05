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
		for(Product p: getAllProducts()) {
			if(p.id == id) {
				return p;
			}
		}
		throw new ProductNotFoundException();
	}

	@Override
	public Product addProductToList(Product product) throws ProductAlreadyExistsException {
		// TODO Auto-generated method stub
		repository.addProductToList(product);
		return product;
	}

	@Override
	public String deleteProduct(int id) throws ProductNotFoundException {
		
		return repository.removeProduct(id) ? "SUCCESS" : "FAIL";

	}

	@Override
	public Product updateProduct(Product product) throws ProductNotFoundException {
		
		Product p = getProductById(product.id)
		p.productName = product.productName;
		p.price = product.price;
		p.category = product.category;
		return p;
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		
		List<Product> productsList = new ArrayList<Product>();
		for(Product p: productsList) {
			if(p.category == category) {
				productsList.add(p);
			}
		}
		if(productsList.size() == 0)
			throw new ProductNotFoundException();
		else
			return productsList;
	}

}
