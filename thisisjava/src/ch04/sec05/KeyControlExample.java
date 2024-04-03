package ch04.sec05;

import java.util.Scanner; // scanner를 사용하기 위하여 import

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner를 생성
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("--------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("--------------------");
			System.out.println("선택: ");

			String strNum = scanner.nextLine(); // 키보드에서 입력한 내용을 읽음 (next와 nextLine의 차이는 next는 공백 이전의 문자를 저장하고,
												// nextLine은 엔터 이전의 문자를 저장한다.
												// ex)"안녕 하세요"룰 저장 시 next : "안녕" ,nextLine : "안녕 하세요"를 저장한다.

			if (strNum.equals("1")) {// strNum는 String 타입이기 때문에 =이 아닌 equals를 사용
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close(); // scanner 사용을 종료할 때 사용됨
	}

}
