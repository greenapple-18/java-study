package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class C {

	A a1 = new A(true);
	A a2 = new A(1); //default로 선언 되었음으로 접근 불가
	A a3 = new A("문자열"); //private로 선언 되었음으로 접근 불가

}
