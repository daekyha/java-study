
public class Main01 {

	public static void main(String[] args) {
		// 출력문
		System.out.println("안녕하세요"); // 줄바꿈
		System.out.printf("안녕하세요"); // 줄바꿈 없음 (\n은 줄바꿈)
		System.out.print("안녕하세요"); // 줄바꿈 없음 변수 가능

		System.out.println("안녕" + "하세요"); // +로 이어붙이기 가능, -는 불가
		System.out.println("안녕" + 123); // 123을 더하려 하면 123을 문자 데이터로 바꿈
		System.out.println("123" + 123); // 얘도 문자데이터로 바꾸서 연결

		System.out.println("123"); //
		System.out.println(123); // 얘도 가능, 만약 영어라면 영어는 변수로 인식

		/*
		 * ===========================================================================
		 */
		// 변수

		// 변수명이 =마크 좌변에 위치하면 무조건 공간
		// 변수명이 =마크 좌변에 위치하지 않으면 무조건 값

		// 변수 선언에 명시된 데이터 타입은 절대적이다ㅣ

		int x = 5;
		int y = 3;
		char a = 'a';
		char b = 65 + 32;
		String s = "안녕";

		System.out.println("x: " + x);
		System.out.println(x + y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		
		System.out.println("==========================");

		/* =========================================================================== */
		/*	자바 에러 종류 3가지
		 * 1. 경고(노랑색 표시) : 실행에 문제는 없으나 좋은 상태는 아님
		 * 2. 컴파일 에러  : 실행이 불가능
		 * 3. Exception(예외)  :실행이 되는데 중간에 멈춤.
		 * 
		 * 컴파일이란?
		 * 자바문법으로 작성한 코드를 컴퓨터가 진짜 이해할 수 있도록 변환.
		 * 
		 */

			    
	}

}
