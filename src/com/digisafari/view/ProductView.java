package com.digisafari.service;

import java.util.List;
import com.digisafari.controller.ProductController;

public class ProductView {
    ProductController productController;
    public void printProductDetails(String productName, String productCategory){
       System.out.println("Name: " + productName);
       System.out.println("Roll No: " + productCategory);
    }
 }