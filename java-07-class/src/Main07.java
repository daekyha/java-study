
public class Main07 {
	public static void main(String[] args) {
		  // 변수의 존배 목적: 데이터 저장
 		// 메서드  존재 목적 : 동작(어떠한 기능을 수행)
 		// 메서드 만드는 법 : 접근제어자 스태틱유무 리턴타입(void;  리턴 타입이 없다.) 메서드명(){}
 		
 		Test t=new Test();
 		t.test1(); 
 		// 메서드/함수 호출/실행(문)
 		// 메서드는 저장공간이 아님.
 		// Ex> t.test()=20; => 불가
 		// 소괄호까지 넣어줘야됨. 없으면 변수를 찾으려고 함.
 			
	}
}

class Test{
	int test1;
	String test2;
	
	void test1(){
		int test1=10;
		System.out.println("test1\n"+test1+"\n"+this.test1);
		//this를 통해서 지역변수가 아닌 전역변수 호출가능. -> 이것 때문에 자바는 전역과 지역변수명이 같은것을 에러띄우지 않음.	
	
		this.test2();
	}
	
	void test2() {
		System.out.println("test2");
		
	}
}