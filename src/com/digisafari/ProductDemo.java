package com.digisafari.service;

import java.util.List;
import com.digisafari.controller.ProductController;
import com.digisafari.view.ProductView;
import com.digisafari.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        ProductService service;
        //fetch Product record based on its id from the repository
    //    Product model  = service.getProductById(1);
        Product model  = retriveProductFromDatabase();
       //Create a view : to write Product details on console
       ProductView view = new ProductView();
       ProductController controller = new ProductController(model, view);
       controller.updateView();
       //update model data
       controller.setProductName("Pears");
       controller.updateView();
    }

    private static Product retriveProductFromDatabase(){
       Product Product = new Product();
       product.setProductName("Medimix");
       product.setCategory("Soap");
       return product;
    }
 }