package ch11.sec03.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = { "100", "1oo" };

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) { // i가 2가 됨에 따라 주어진 배열의 크기를 초과하여 예외가 발생
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch (Exception e) { // 상위 예외 클래스는 아래쪽에 작성 ( 일반적으로 위에서부터 예외처리를 검사하기 때문에 전체 예외를 관리하는 Exception을 위로 배치할 시
									// 							하위 예외를 구분할 수 없게 된다.)
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}

}
