package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire(); // Tire()라는 클래스는 hankook과 kumho 모두 존재하여 어느 클래스의 Tire을
																	// 사용할 것인지 알 수 없다. 따라서 직접 경로를 지정하여 어느 클래스의 Tire를 사용할
																	// 지 지정해 주어야 한다.

	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();

}
