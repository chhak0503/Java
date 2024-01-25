package com.myshop.dao;

import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.dto.OrderDTO;

public class OrderDAO extends DBHelper{
	
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	
	
	public void insertOrder(OrderDTO dto) {
		try {
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public OrderDTO selectOrder(int orderNo) {
		try {
			
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<OrderDTO> selectOrders() {
		try {
			
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void updateOrder(OrderDTO dto) {
		try {
			
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteOrder(int orderNo) {
		try {
			
			// 3단계
			// 4단계
			// 5단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
