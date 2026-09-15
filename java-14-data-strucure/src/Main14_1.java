
public class Main14_1 {
	public static void main(String[] args) {
		new A(2);
		
		// List
	}
}

class A {
	int a=0;
	static int x;
	// 명시적 초기화
	// 전역 변수 생성 후 초기화 => 사용하지 않음.
	// 늘 같은 값으로 생성되기 때문. 보통 다른값을 가ㅣㅈ게 하는 경우가 많기 때문
	// 상수일때만 사용./
	
	// 순서 3번
	A(int num){
		this.a=num;
		System.out.println(3);
		// 생성자 개념을 이용해서 초기화.
	}
	
	//오로지 초기화 목적으로만 있는것(필수는 아님)
	//=> [초기화블럭]
	// 1. 인스턴스 초기화 블럭 : 명시적초기화랑 차이가 크지 않기때문에 잘 사용하지 않음.
	// EX
	// 순서 2번
	{
		System.out.println(2); 
		this.a=20;
	}
	
	// 2. 스태틱 블럭 : 인스턴스 변수 초기화 불가, 가끔 사용해야 할 때가 있음.
	// EX
	// 순서 1번
	static {
		System.out.println(1);
		x=12;
	}
	
	
	
}