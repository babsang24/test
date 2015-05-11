package kr.ac.kpu.ebiz.spring.lecture3;

public class CleanUpUser {

	String username;
	String password;
	String address;

	public CleanUpUser() {
		System.out.println("User가 생성되었습니다.");
	}

	public void cleanup() {
		System.out.println("User가 Cleanup되었습니다.");
	}

	public static CleanUpUser createUser() {
		return new CleanUpUser();
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
