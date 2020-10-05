package com.digisafari.controller;

import com.digisafari.service.ProductService;

public class ProductController {
  //

  ProductService productService;
  private ProductView view;

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
    model.setProductCategory(category);
  }

  public String getProductCategory() {
    return model.getProductCategory();
  }

  public void updateView() {
    view.printProductDetails(model.getName(), model.getCategory());
  }
}
