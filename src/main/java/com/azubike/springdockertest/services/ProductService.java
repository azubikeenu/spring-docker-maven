package com.azubike.springdockertest.services;



import com.azubike.springdockertest.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/26/16.
 */
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
