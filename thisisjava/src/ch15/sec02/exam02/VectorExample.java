package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;
import ch15.sec02.exam01.Board;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>(); // Vector<>()를 ArrayList<>()로 바꿀 시 에러가 발생할 수 있다.(ArrayList는 두 스레드가 동시에 add() 메소드를 호출할 수 있기 때문에 충돌이 발생 -> 하나만 저장된다.)
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i<= 2000; i++) {
					list.add(new Board("제목" +i , "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {	
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();		
	}
	
}
