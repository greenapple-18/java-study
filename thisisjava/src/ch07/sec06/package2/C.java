package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {

	public void method() {
		A a = new A(); // A는 protected로 선언되었기 때문에 다른 패키지에 있는 C 에서는 A에 접근할 수 없다.
		a.field = "vlaue";
		a.method();
	}
}
