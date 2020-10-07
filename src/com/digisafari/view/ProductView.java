package com.digisafari.view;

import com.digisafari.controller.ProductController;

public class ProductView {
    ProductController productController;
    public void printProductDetails(String productName, String productCategory, double price, double rating){
       System.out.println("Name: " + productName);
       System.out.println("Category: " + productCategory);
       System.out.println("Rating: " + rating);
       System.out.println("Price: " + price);
    }
 }