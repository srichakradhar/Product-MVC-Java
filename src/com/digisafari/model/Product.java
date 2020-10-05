package com.digisafari.model;

public class Product implements Comparable<Product> {
  //All the properties
  int id;
  String productName;
  double price;
  String category;

  //no-arg constructor
  Product() {}

  public Product(int id, String productName, double price, String category) {
    super();
    this.id = id;
    this.productName = productName;
    this.price = price;
    this.category = category;
  }

  //getter and setters

  public int getId() {
    return id;
  }

  public void setld(int id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(string category) {
    this.category = category;
  }

  @Override
  public int compareTo(Product product) {
    if (this.id == product.id) return 0; else return this.id - product.id;
  }

  /* Returns the string representation of this Product. 
	The format of string is "productName (id, category, price)"
	*/
  @Override
  public String toString() {
    return String.format("%s (%d, %s, %.2f)", this.productName, this.id, this.category, this.price);
  }
}
