package com.digisafari.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.digisafari.exception.ProductAlreadyExistsException;
import com.digisafari.exception.ProductNotFoundException;
import com.digisafari.model.Product;
import com.digisafari.repository.ProductRepository;

public class ProductService implements IProductService {
	
	ProductRepository repository;
	List<Product> productsList;
	
	public ProductService() {
		repository = new ProductRepository();
		productsList = getAllProducts();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repository.getProductsList();
	}

	@Override
	public Product getProductById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		for(Product p: getAllProducts()) {
			if(p.getId() == id) {
				return p;
			}
		}
		throw new ProductNotFoundException("Couldn't find the product requested.");
	}

	@Override
	public Product addProductToList(Product product) throws ProductAlreadyExistsException {
		// TODO Auto-generated method stub
		repository.addProductToList(product);
		return product;
	}

	@Override
	public String deleteProduct(int id) throws ProductNotFoundException, ProductAlreadyExistsException {
		
		return repository.removeProduct(id) ? "SUCCESS" : "FAIL";

	}

	@Override
	public Product updateProduct(Product product) throws ProductNotFoundException {
		
		Product p = getProductById(product.getId());
		p.setProductName(product.getProductName());
		p.setPrice(product.getPrice());
		p.setCategory(product.getCategory());
		return p;
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) throws ProductNotFoundException {
		
		List<Product> productsFiltered = new ArrayList<Product>();
		for(Product p: this.productsList) {
			if(p.getCategory().equals(category)) {
				productsFiltered.add(p);
			}
		}
		if(productsFiltered.size() == 0)
			throw new ProductNotFoundException("Couldn't find the product requested.");
		else
			return productsFiltered;
	}

	@Override
	public List<Product> getProductsAbovePrice(double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		List<Product> productsFiltered = new ArrayList<Product>();
		for(Product p: productsList) {
			if(p.getPrice() > price) {
				productsFiltered.add(p);
			}
		}
		if(productsList.size() == 0)
			throw new ProductNotFoundException("Couldn't find the product requested.");
		else
			return productsFiltered;
	}
	
	Comparator<Product> compareByRating = new Comparator<Product>() {
	    @Override
	    public int compare(Product o1, Product o2) {
	        return Double.compare(o1.getRating(), o2.getRating());
	    }
	};

	@Override
	public List<Product> sortProductByRating() throws ProductNotFoundException {
		List<Product> sortedList =  this.productsList;
		Collections.sort(sortedList, compareByRating);
		return sortedList;
	}
	
	Comparator<Product> compareByName = new Comparator<Product>() {
	    @Override
	    public int compare(Product p1, Product p2) {
	        return p1.getProductName().compareTo(p2.getProductName());
	    }
	};

	@Override
	public List<Product> sortProductByName() throws ProductNotFoundException {
		List<Product> sortedList =  this.productsList;
		Collections.sort(sortedList, compareByName);
		return sortedList;
	}

}
