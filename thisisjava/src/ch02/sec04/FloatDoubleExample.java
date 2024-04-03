package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float var1 = 0.1234567890123456789f; // 소숫점 아래 10개만 표현 가능
		double var2 = 0.1234567890123456789; // 소숫점 아래 18개까지 표현 가능
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);

		double var3 = 3e6; // e6은 10^6을 의미
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

	}

}
