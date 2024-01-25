package com.myshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
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
	
	
	public List<OrderDTO> selectOrders(String custId) {
		
		List<OrderDTO> orders = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				OrderDTO order = new OrderDTO();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setOrderProduct(rs.getInt(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderDate(rs.getString(5));
				order.setProdName(rs.getString(6));
				order.setPrice(rs.getInt(7));
				order.setCompany(rs.getString(8));
				
				orders.add(order);
			}
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
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
