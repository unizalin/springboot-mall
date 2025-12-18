package com.unizalin.springbootmall.service.impl;

import com.unizalin.springbootmall.dao.ProductDao;
import com.unizalin.springbootmall.model.Product;

import com.unizalin.springbootmall.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId){
        return productDao.getProductById(productId);
    }
}
