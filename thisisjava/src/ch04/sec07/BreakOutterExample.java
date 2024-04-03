package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception { // throws Exception이란 해당 main문에 예외가 발생할 수 있다는 것을 명시하기 위해
																// 사용되었다. (크게 기능이 있거나 하지는 않음)
		Outter: for (char upper = 'A'; upper < 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}

		}
		System.out.println("프로그램 실행 종료");

	}

}
