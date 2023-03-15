package com.hanhong.springbootmall.service;

import com.hanhong.springbootmall.constant.ProductCategory;
import com.hanhong.springbootmall.dto.ProductRequest;
import com.hanhong.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
