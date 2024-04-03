package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}

		int v3 = v1 + v2 + 5; // v2는 if문 안에 만들어진 변수이기 때문에 if문 밖에서는 사용할 수 없다. 따라서 v2에서 컴파일 에러가 발생한다.

	}

}
