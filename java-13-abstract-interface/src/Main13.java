
public class Main13 {
	public static void main(String[] args) {
		
		//abstract : 메서드를 정의하지 않겠다.
		//추상 ; OOP 특징 4가지
		//오버라이딩 시 부모클래스에 주로 사용

		//추상클래스를 상속받은 자식클래스에서 아무것도 없으면
		//추상매서드를 상속받기 때문에(추상클래스) 에러.
		//때문에 오버라이딩이 필요.
		
		// 추상클래스
		// 하나 이상의 추상메서드를 포함하는 클래스
		// 추상메서드를 상속받은 자식 클래스는 무조건 해당 매서드를 오버라이딩 해야됨.
		// 필수는 아님/ 사용목적: 클래스 간 관계 형성(구조형성)/ 의사표시(협업간 이거 건들 ㄴㄴ 의미)
		//

	}
}

abstract class A{ 			// 추상매서드가 하나라도 있다면 추상클래스
	abstract void test();	// 추상매서드(바디 x)
	void test1() {}; 		// 추상 매서드가 아니어도 가능/
	String name;			// 변수 선언 또한 상관이 없음.
}
class B extends A{
	void test(){			//오버라이딩을 안하면 추상매서드를 상속받기 때문에 추상클래스가 되어버림.
		
	}
}

interface C{			// 순도 100% 추상클래스-> 인터페이스 / 내부에 있는 모든건 변수=상수, 매서드=추상매서드 취급.
	void test(); 		// 인터페이스 내에 있으므로 자동 추상매서드 취급.
	int a=100;			// 변수는 자동 상수 취급=> 선언과 동시에 초기화 필요.
}
interface C1{}


class D implements C{	// 인터페이스는 extends로 상속받지 못하고 implements로 상속.
	public void test(){// 인터페이스를 상속받은 매서드를 오버라이딩 할 경우 public 를 붙여야됨.

	}
}

class E implements C, C1{	// 인터페이스는 다중 상속이 가능함.
	public void test() {   // 어차피 오버라이딩 해야 사용이 가능하기 때문
		
	}
}
class F extends A implements C{
	public void test() {
		
	}
}