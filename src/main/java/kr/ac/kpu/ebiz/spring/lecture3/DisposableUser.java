package kr.ac.kpu.ebiz.spring.lecture3;

import org.springframework.beans.factory.DisposableBean;

public class DisposableUser implements DisposableBean {

	String username;
	String password;
	String address;

	public DisposableUser() {
		System.out.println("User가 생성되었습니다.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("User를 종료합니다.");
	}

	public static DisposableUser createUser() {
		return new DisposableUser();
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
