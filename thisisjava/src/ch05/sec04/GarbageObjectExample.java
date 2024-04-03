package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // 힙 영역에 존재하는 "여행"을 나타내는 객체가 쓰레기 객체로 된다. 

		String kind1 = "자동차";
		String kind2 = kind1; // kind2 역시 "자동차"가 저장되어 있는 힙 영역을 가르키는 주소가 저장된다.
		kind1 = null; // kind1의 값{자동차가 저장되어 있는 힙 영역을 가르키는 주소)를 null 값으로 초기화
		System.out.println("kind1: " + kind1);
		System.out.println("kind2: " + kind2);

	}

}
