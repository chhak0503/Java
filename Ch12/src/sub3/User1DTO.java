package sub3;

public class User1DTO {

	private String userid;
	private String name;
	private String hp;
	private int age;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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
		return "User1DTO [userid=" + userid + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}
	
	
	
}













