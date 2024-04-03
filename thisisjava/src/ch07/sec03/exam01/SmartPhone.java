package ch07.sec03.exam01;

public class SmartPhone extends Phone {

	public SmartPhone(String model, String color) {
		super(); // 생략해도 컴파일 과정에서 자동으로 추가됨.
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(PString model, String color)생성자 실행됨");
	}

}
