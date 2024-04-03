package ch13.sec05;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) { // 모든 사람이면 등록 가능
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");

	}

	public static void registerCourse2(Applicant<? extends Student> applicant) { // 학생만 등록 가능
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2를 등록함 ");
	}

	public static void registerCourse3(Applicant<? super Worker> applicant) { // 직장인 및 일반인만 등록 가능
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}
