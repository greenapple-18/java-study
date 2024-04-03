package ch07.sec03.exam02;

public class SmartPhone extends Phone {

	public SmartPhone(String model, String color) {
		super(model, color); // 부모 클래스 생성자에 매개변수가 있기 때문에 개발자가 반드시 직접 작성해 주어야 한다.
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
