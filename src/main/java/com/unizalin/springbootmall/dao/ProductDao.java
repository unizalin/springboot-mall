package com.unizalin.springbootmall.dao;

import com.unizalin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
