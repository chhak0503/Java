package com.myshop.dao;

import java.util.List;

import com.myshop.db.DBHelper;
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
		try {
			
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateProduct(ProductDTO dto) {
		try {
			// 3단계
			// 4단계
			// 5단계
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
