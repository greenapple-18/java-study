package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 자식 클래스에서 메소드를 오버라이딩 하여 재정의를 하였지만 super.fly를 통해 부모 클래스의 fly 메소드를 사용할 수 있다.
		}
	}

}
