package com.hanhong.springbootmall.dao;

import com.hanhong.springbootmall.constant.ProductCategory;
import com.hanhong.springbootmall.dto.ProductRequest;
import com.hanhong.springbootmall.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
