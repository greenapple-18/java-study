package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		// vehicle.checkFare(); vehicle 인터페이스에는 checkFare 메소드가 선언되어 있지 않기 때문에 사용 X

		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();

	}

}
