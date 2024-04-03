package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); //arr1과 arr2의 값은 동일하지만 arr은 배열, 즉 참조 타입이기 때문에 같은 주소를 가르키지 않아 false가 출력된다.
		System.out.println(arr2 == arr3);
		

	}

}
