package com.example.demo.Service.Product;




import com.example.demo.DTO.productDTO;
import com.example.demo.DTO.productShortDescription;
import com.example.demo.Model.Product;

public interface ProductService {
    String productSave(productDTO product);


    Product getProductDetails(String productName);
}
