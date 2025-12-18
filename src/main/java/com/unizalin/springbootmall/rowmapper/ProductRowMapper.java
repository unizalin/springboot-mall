package com.unizalin.springbootmall.rowmapper;

import com.unizalin.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        product.setCategory(rs.getString("category"));
        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));

        // 如果 Product 的欄位是 LocalDateTime
        LocalDateTime createdDate = rs.getObject("created_date", LocalDateTime.class);
        LocalDateTime lastModifiedDate = rs.getObject("last_modified_date", LocalDateTime.class);
        product.setCreatedDate(createdDate);
        product.setLastModifiedDate(lastModifiedDate);

        return product;
    }
}
