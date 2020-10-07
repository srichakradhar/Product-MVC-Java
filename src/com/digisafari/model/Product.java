package com.digisafari.model;

public class Product implements Comparable<Product> {
  //All the properties
  int id;
  String productName;
  double price;
  String category;
  double rating;

  //no-arg constructor
  public Product() {}

  public Product(int id, String productName, String category, double price, double rating) {
    super();
    this.id = id;
    this.productName = productName;
    this.price = price;
    this.category = category;
    this.rating = rating;
  }

  //getter and setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getRating() {
	return rating;
}

public void setRating(double rating) {
	this.rating = rating;
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

  public void setCategory(String category) {
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
