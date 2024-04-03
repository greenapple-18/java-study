package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {

	public D() { // 상속을 통해서는 생성자 호출, 필드값 변경, 메소드 호출이 가능
		super();
	}

	public void method1() {
		this.field = "value";
		this.method();
	}

	public void melthod2() { // 직접 객체를 생성하여 사용하는 것은 안됨
		A a = new A();
		a.field = "value";
		a.method();
	}

}
