package main;

public class SQL {
	public static final String INSERT_USER  = "INSERT INTO `User3` VALUES (?,?,?,?);";
	public static final String SELECT_USERS = "SELECT * FROM `User3`;";
	public static final String SELECT_USER  = "SELECT * FROM `User3` WHERE `name`=?;";
	public static final String DELETE_USER  = "DELETE FROM `User3` WHERE `uid`=?;";
}
