package ch08.sec07;

public interface Service {

	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}

	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}

	private void defaultCommon() { // private 메소드는 default 메소드 안에서만 호출이 가능
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}

	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드1");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드1");
		staticCommon();
	}

	private static void staticCommon() { // private 정적 메소드는 default 메소드 뿐만 아니라 static 메소드 안에서도 호출 가능
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}

}
