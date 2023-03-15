package com.hanhong.springbootmall.service;

import com.hanhong.springbootmall.dto.ProductRequest;
import com.hanhong.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
