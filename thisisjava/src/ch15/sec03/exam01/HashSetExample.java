package ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 위 Java와 동일한 객체로 판단하여 중복저장하지 않는다.
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	}
}
