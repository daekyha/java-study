
public class A_9 {
	public static void main(String[] args) {
		
		// Main 클래스 안의 내용을 올바르게 수정해주세요.
		자동차 자동차 = new 자동차();

		자동차.달리다();

		
		
		// 문제 : 아래 코드가 실행되도록 해주세요.
		new 자동차().달리다();

		
		
		// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.
		System.out.println("==================================");
		System.out.println("Hello world!");
		A자동차 a자동차 = new A자동차();
		B자동차 b자동차 = new B자동차();
		C자동차 c자동차 = new C자동차();
		D자동차 d자동차 = new D자동차();
		E자동차 e자동차 = new E자동차();

		a자동차.달리다();
		b자동차.달리다();
		c자동차.달리다();
		d자동차.달리다();
		e자동차.달리다();

		
		
		// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
		System.out.println("==================================");
		자동차.달리다();

		
		
		// 문제 : 구구단을 만들어주세요
		System.out.println("==================================");
		new 구구단출력기().작동();
		
		
		
		// 문제 - 매개변수를 사용해서 문제를 풀어주세요.
		System.out.println("==================================");
		계산기.더한결과를_화면에_출력(10, 20);
		계산기.더한결과를_화면에_출력(50, 20);
		계산기.뺀결과를_화면에_출력(50, 20);
		계산기.뺀결과를_화면에_출력(5, 2);
		계산기.곱한결과를_화면에_출력(5, 2);
		
		
		
		//문제 - 함수를 실행하면 값을 돌려주도록 만들어주세요.
		System.out.println("==================================");
	    int 결과;
	    결과 = 계산기.합(10, 20);
	    System.out.println("결과 : " + 결과);
	    결과 = 계산기.합(30, 20);
	    System.out.println("결과 : " + 결과);
	    결과 = 계산기.합(30, 70);
	    System.out.println("결과 : " + 결과);
	    결과 = 계산기.차(30, 70);
	    System.out.println("결과 : " + 결과);
	    결과 = 계산기.곱(3, 7);
	    System.out.println("결과 : " + 결과);
	    
	    
		
	    //문제 - 1부터 n까지의 합을 반환하는 함수
	    System.out.println("==================================");
	    // 예시 시작
	    int c = 20 + Math.더하기(10, 20);
	    System.out.println(c);
	    // 예시 끝
	    
	    int 결과1 = Math.oneToSum(3);
	    System.out.println("결과1 : " + 결과1);
	    // 출력 : 결과1 : 6
	    
	    int 결과2= Math.oneToSum(10);
	    System.out.println("결과2 : " + 결과2);
	    // 출력 : 결과2 : 55
	    
	    
	    
	    //문제 - n부터 m까지의 합을 반환하는 함수
	    System.out.println("==================================");
	    int 결과11 = Math.nToMSum(2, 3);
	    System.out.println("결과1 : " + 결과11);
	    // 출력 : 결과1 : 5
	    
	    int 결과22 = Math.nToMSum(5, 10);
	    System.out.println("결과2 : " + 결과22);
	    // 출력 : 결과2 : 45
	    
	}
}

class 자동차 {
	void 달리다() {
		System.out.println("자동차가 달립니다.");
	}
}

class A자동차 {
	void 달리다() {
		System.out.println("A자동차가 달립니다.");
	}
}

class B자동차 {
	void 달리다() {
		System.out.println("B자동차가 달립니다.");
	}
}

class C자동차 {
	void 달리다() {
		System.out.println("C자동차가 달립니다.");
	}
}

class D자동차 {
	void 달리다() {
		System.out.println("D자동차가 달립니다.");
	}
}

class E자동차 {
	void 달리다() {
		System.out.println("E자동차가 달립니다.");
	}
}

class 구구단출력기 {
	void 작동(){
		for (int i = 2; i <= 9; i++) {
			System.out.println("==" + i + "단==");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
}

class 계산기{
	static void 더한결과를_화면에_출력(int a, int b) {
		System.out.println("결과 : " + (a+b));
	}
	static void 뺀결과를_화면에_출력(int a, int b) {
		System.out.println("결과 : " + (a+b));
	}
	static void 곱한결과를_화면에_출력(int a, int b) {
		System.out.println("결과 : " + (a+b));
	}
	static int 합(int a, int b) {
		return a+b;
	}
	static int 차(int a, int b) {
		return a-b;
	}
	static int 곱(int a, int b) {
		return a*b;
	}
	
}

class Math {
	  // static => 본사직원
	  // static은 현재 클래스에 지금당장 존재한다.
	  static int 더하기(int a, int b) {
	    // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
	    int c = a + b;
	    
	    // return 값의 타입과 함수명의 앞부분이 같아야 한다.
	    // return => 변신
	    return c;
	  }
	  
	 static int oneToSum(int a) {
		 return a*(a+1)/2;
	 }
	 static int nToMSum(int a, int b) {
		 return b*(b+1)/2-a*(a-1)/2;
	 }
}