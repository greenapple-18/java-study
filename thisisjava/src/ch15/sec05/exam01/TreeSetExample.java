package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		for (Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위의 점수: " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");

		NavigableSet<Integer> descendingScores = scores.descendingSet(); // scores에 저장된 값들을 내림차순으로 리턴
		for (Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		NavigableSet<Integer> rangeSet = scores.tailSet(80, true); // 80 이상인 값들을 리턴 (뒤에 true를 붙혔으니 80도 포함)
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		rangeSet = scores.subSet(80, true, 90, false); // 80이상 90 미만인 값들을 리턴
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}
}
