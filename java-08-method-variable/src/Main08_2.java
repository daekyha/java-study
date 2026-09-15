
public class Main08_2 {
	public static void main(String[] args) {
		Test1 test1 =new Test1();
		test1.y=30;
		System.out.println(test1.y);
		
		Test1 test2 =new Test1();
		System.out.println(test2.y);
		
		//휴지심도 없다.
		String a=null;		
		//휴지심은 있는데 휴지가 없다.
		String b="";
		//휴지심과 휴지가 있다.
		String c="123123";
		System.out.println(a);  // 출력값은 null (없다는 상태를 알려줌.)
		System.out.println(b);  // 출력값은 [공백] (아무것도 안뜸.)
		//
		
	}
}
class Test1{
	//전역변수
	//스태틱 변수, 클래스 변수
	static int y=20;
	
	//인스턴스 변수
	int z=10;
	/*======================================*/
	//전역변수는 스태틱 아니면 휩역역에 저장.
	//지역변수는 스택영역에서 저장.
	static void test() {
		int x=10;
		//메서드 자체는 스태틱이지만, 스택영역에 존재.(지역변수 취급)
	}
	static void test1() {
		test();
//		System.out.println(x); 지역변수니까 스코프가 끝난 시점.
		Main08_2 d = new Main08_2();
	}
	
	// final -> 상수
	// 변하지 못하는 수
	//선언과 동시에 초기화를 해야만 한다.
	final int al =10;
	
	
}
