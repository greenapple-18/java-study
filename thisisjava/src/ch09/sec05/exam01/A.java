package ch09.sec05.exam01;

public class A {

	int field1;

	void method1() {
	}

	static int field2;

	static void method2() {
	}

	class B {
		void method() {
			field1 = 10;
			method1();
			field2 = 10;
			method2();

		}
	}

	static class C {
		void method() {
			//field1과 method1()은 class A가 생성되면 함께 만들어지고, 종료되면 함께 없어지기 때문에 정적 클래스인 C에서는 사용할 수 없다.(항상 존재하는 것들이 아니기 때문)
			field2 = 10;
			method2();
		}
	}

}
