
public class Main08_1 {
	public static void main(String[] args) {
		사람 a사람=new 사람();
		a사람.말하다();
		
		/*===========================================================================*/
		
	    거북이 a거북이 = new 거북이();
	    
	    a거북이.걷다();
	    // 출력 => 걷다
	    a거북이.수영하다();
	    // 출력 => 수영하다

	    /*===========================================================================*/
		
		//static (정적)
	    // static method는 객체화 없이 설계도한테 바로 호출
	    Test.test2();
	    
	    //프로그램이 시작될때 생성됐다가 프로그램 끝날 때 사라짐./
	    //Test 클래스를 사용해서 만들어낸 개체 = Test 클래스의 인스턴스
	    //스태틱 메서드는 스태틱 요소들만 참조가능.
	    //스태틱 변수는 모든 객체들이 공유하는 자원이 된다.
	    
	    Test test = new Test();
	    test.test1();
	    System.out.println(test.test);
	    
	  
	 		
	}
}

class 사람 {
	  // 사람은 `말하다` 라는 기능을 가지고 있습니다.
	  void 말하다() {
	    System.out.println("사람이 말합니다.");
	  }
}
class 거북이{
	void 걷다() {
		System.out.println("걷다");
	}
	void 수영하다() {
		System.out.println("수영하다");		
	}
}

class Test{
	int x=20; //인스턴스 변수
	static int test=10; // 스태틱 변수/클래스변수
	void test1() {
		System.out.println(/*this.*/test);
		//this가 존재하려면 객체가 존재해야됨/
		//굳이 this를 쓸 이유가 없기 때문에 예외처리
		//쓰고 싶으면 this를 생략하거나 'Test.test'로 Test객체를 직접 호출
		
	}
	public static void test2() {
		System.out.println("test2");
	}
}

