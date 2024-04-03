package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수: " + hashSet.size());

		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수: " + hashSet.size()); // s1과 s2는 동등한 내용을 가지고 있기 때문에 재정의한 hashCode()의 결과가 같아진다. 따라서 중복저장 되지 않는다.

		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: " + hashSet.size());
	}

}
