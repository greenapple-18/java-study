package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus); // Bus로 자동 타입 변환
		driver.drive(taxi); // Taxi로 자동 타입 변환

	}

}
