package com.unizalin.springbootmall.constant;

import com.unizalin.springbootmall.model.Product;

public class MyTest {
    public static void main(String[] args) {
        ProductCategory category = ProductCategory.FOOD;
        System.out.println("Product Category: " + category);
        String s = category.name();
        System.out.println("Category as String: " + s);

        // 將 String 轉回 enum 型別
        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);
        // 輸出 CAR
        System.out.println("Category from String: " + category2);
    }
}
