package sub2;

public class User1VO { // VO(Value Object) : 데이터베이스의 개체(Row)를 자바 객체로 처리할때 사용하는 오브젝트
	
	private String user_id;
	private String name;
	private String hp;
	private int age;
		
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User1 [user_id=" + user_id + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}	
}