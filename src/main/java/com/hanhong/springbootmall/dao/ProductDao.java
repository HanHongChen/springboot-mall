package com.hanhong.springbootmall.dao;

import com.hanhong.springbootmall.dto.ProductRequest;
import com.hanhong.springbootmall.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
