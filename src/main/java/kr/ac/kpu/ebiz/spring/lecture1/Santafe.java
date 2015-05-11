package kr.ac.kpu.ebiz.spring.lecture1;

public class Santafe extends AbstractCar {

	public void forward() {
		System.out.println("전진합니다.");
	}

	public void backward() {
		System.out.println("후진합니다.");
	}

	public void stop() {
		System.out.println("정지합니다.");
	}

	public void off() {
		System.out.println("시동을 끕니다.");
	}

}
