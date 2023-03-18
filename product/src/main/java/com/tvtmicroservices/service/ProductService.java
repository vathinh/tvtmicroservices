package com.tvtmicroservices.service;

import com.tvtmicroservices.dto.ProductRequest;
import com.tvtmicroservices.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();


}
