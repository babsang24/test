package kr.ac.kpu.ebiz.spring.lecture3;

public class LazyUser {

	String username;
	String password;
	String address;

	public LazyUser() {
		System.out.println("Lazy User가 생성되었습니다.");
	}

	public static LazyUser createUser() {
		return new LazyUser();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
