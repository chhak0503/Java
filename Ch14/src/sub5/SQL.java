package sub5;

public class SQL {

	public static final String INSERT_USER  = "INSERT INTO `User2` VALUES (?,?,?,?)";
	public static final String SELECT_USERS = "SELECT * FROM `User2`";
	public static final String SELECT_USER  = "SELECT * FROM `User2` WHERE `uid`=?";
	public static final String UPDATE_USER  = "UPDATE `User2` SET "
											+ "`name`=?,"
											+ "`birth`=?,"
											+ "`addr`=? "
											+ "WHERE `uid`=?";
											
	public static final String DELETE_USER  = "DELETE FROM `User2` WHERE `uid`=?";
	
	
}
