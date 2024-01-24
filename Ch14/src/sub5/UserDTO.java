package sub5;

// Data Transfer Object(테이블 객체)
public class UserDTO {
	
	private String uid;
	private String name;
	private String birth;
	private String addr;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "UserDTO [uid=" + uid + ", name=" + name + ", birth=" + birth + ", addr=" + addr + "]";
	}
}
