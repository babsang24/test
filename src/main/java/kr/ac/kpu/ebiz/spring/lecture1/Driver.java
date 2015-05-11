package kr.ac.kpu.ebiz.spring.lecture1;

public class Driver {

	Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void drive() {
		Car car = new Santafe();
		car.on();
		car.forward();
		car.stop();
		car.off();
	}

}
