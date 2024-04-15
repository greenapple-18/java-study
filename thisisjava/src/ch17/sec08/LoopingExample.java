package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };

		Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)); // peek는 최종 처리가 필요하지만 구현되어있지 않기
																						// 때문에 실질적으로 동작하지 않음

		int total = Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();
		System.out.println("총합: " + total + "\n");

		Arrays.stream(intArr).filter(a -> a % 2 == 0).forEach(n -> System.out.println(n));
	}
}
