package com.myshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper {
	
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	public void insertProduct(ProductDTO dto) {
		try {
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ProductDTO selectProduct(int prodNo) {
		try {
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProductDTO> selectProducts() {
		
		List<ProductDTO> products = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				products.add(product);
			}
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public void updateProduct(ProductDTO dto) {
		try {
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteProduct() {
		try {
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
