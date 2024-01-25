package com.myshop.db;

public class SQL {
	// Customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` SET "
												+ "`custId`=?,"
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`addr`=?,"
												+ "`rdate`=NOW()";

	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	public static final String SELECT_CUSTOMERS = "";
	public static final String UPDATE_CUSTOMER = "";
	public static final String DELETE_CUSTOMER = "";
	
	// Order
	public static final String INSERT_ORDER = "";
	public static final String SELECT_ORDER = "";
	public static final String SELECT_ORDERS = "SELECT a.*, `prodName`, `price`, `company` FROM `order` AS a "
											 + "JOIN `Product` as b on a.orderProduct = b.prodNo "
											 + "WHERE `orderId`=? "
											 + "ORDER BY `orderDate` DESC";
	public static final String UPDATE_ORDER = "";
	public static final String DELETE_ORDER = "";
	
	// Product
	public static final String INSERT_PRODUCT = "";
	public static final String SELECT_PRODUCT = "";
	public static final String SELECT_PRODUCTS = "";
	public static final String UPDATE_PRODUCT = "";
	public static final String DELETE_PRODUCT = "";
	
	
	
	
	
	
	
	
	
}
