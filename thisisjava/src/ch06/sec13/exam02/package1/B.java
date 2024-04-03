package ch06.sec13.exam02.package1;

public class B {

	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열"); // String 타입은 private로 선언되었음으로 생성자 접근 불가
}
