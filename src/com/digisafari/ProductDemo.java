package com.digisafari;

import java.util.List;
import com.digisafari.controller.ProductController;
import com.digisafari.exception.ProductNotFoundException;
import com.digisafari.view.ProductView;
import com.digisafari.service.ProductService;
import com.digisafari.model.Product;

public class ProductDemo {
    public static void main(String[] args) throws ProductNotFoundException {
        ProductService service = new ProductService();
        //fetch Product record based on its id from the repository
        Product model  = service.getProductById(1);
//        Product model  = retriveProductFromDatabase();
       //Create a view : to write Product details on console
       ProductView view = new ProductView();
       ProductController controller = new ProductController(model, view);
       controller.updateView();
       //update model data
       controller.setProductName("Pears");
       controller.updateView();
       List<Product> productsList = service.getAllProducts();
       System.out.println("All Products:");
       for(Product p: productsList) {
    	   model  = p;
    	   controller = new ProductController(model, view);
           controller.updateView();
       }
       productsList = service.getAllProductsByCategory("Footwear");
       System.out.println("##### Footwear:");
       for(Product p: productsList) {
    	   model  = p;
    	   controller = new ProductController(model, view);
           controller.updateView();
       }
       productsList = service.getProductsAbovePrice(350);
       System.out.println("##### Price > 1000:");
       for(Product p: productsList) {
    	   model  = p;
    	   controller = new ProductController(model, view);
           controller.updateView();
       }
       productsList = service.sortProductByRating();
       System.out.println("##### Rating Sorted:");
       for(Product p: productsList) {
    	   model  = p;
    	   controller = new ProductController(model, view);
           controller.updateView();
       }
       productsList = service.sortProductByName();
       System.out.println("##### Name Sorted:");
       for(Product p: productsList) {
    	   model  = p;
    	   controller = new ProductController(model, view);
           controller.updateView();
       }
    }

    private static Product retriveProductFromDatabase(){
       Product product = new Product();
       product.setProductName("Medimix");
       product.setCategory("Soap");
       return product;
    }
 }