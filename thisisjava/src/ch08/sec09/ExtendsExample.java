package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();

		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB(); InterfaceA로 선언되었기 때문에 A 인터페이스에 있는 메소드만 실행 가능
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		// ib.methodA();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
