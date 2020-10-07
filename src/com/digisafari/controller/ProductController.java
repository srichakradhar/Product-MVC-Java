package com.digisafari.controller;

import com.digisafari.service.ProductService;
import com.digisafari.model.Product;
import com.digisafari.view.ProductView;

public class ProductController {
  //

  ProductService productService;
  private ProductView view;
private Product model;

  public ProductController(Product model, ProductView view) {
    this.model = model;
    this.view = view;
  }

  public void setProductName(String name) {
    model.setProductName(name);
  }

  public String getProductName() {
    return model.getProductName();
  }

  public void setProductCategory(String category) {
    model.setCategory(category);
  }

  public String getProductCategory() {
    return model.getCategory();
  }

  public void updateView() {
    view.printProductDetails(getProductName(), getProductCategory(), getProductPrice(), getProductRating());
  }

private double getProductRating() {
	return model.getRating();
}

private double getProductPrice() {
	return model.getPrice();
}
}
