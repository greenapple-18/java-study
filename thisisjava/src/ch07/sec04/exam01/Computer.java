package ch07.sec04.exam01;

public class Computer extends Calculator {

	@Override // 컴파일 시 정확히 오버라이딩이 되었는지 체크해 준다.(생략 가능).  문제가 있으면 컴파일 에러를 출력한다.
	public double areaCircle(double r) {
		System.out.println("Computler 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
