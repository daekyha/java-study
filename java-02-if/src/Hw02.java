
public class Hw02 {
	public static void main(String[] args) {

		int a = 10;

		// `==` => 같다.
		if (a == 10) {
			System.out.println("참");
		}

		// `!=` => 같지 않다.
		if (a != 10) {
			System.out.println("거짓");
		}

		if (a > 10) {
			System.out.println("거짓");
		}

		if (a >= 10) {
			System.out.println("참");
		}

		int b = 10;

		if (a == b) {
			System.out.println("참");
		}

		// boolean c => c 에는 오직 true/false 만 담을 수 있다.
		boolean c = a != b;

		if (c) {
			System.out.println("거짓");
		}

		if (c == false) {
			System.out.println("참");
		}

		// `!` => 반전
		if (!c) {
			System.out.println("참");
		}

		// `!` => 반전
		if (!(!c)) {
			System.out.println("거짓");
		}

		boolean d = true;

		if (c != d) {
			System.out.println("참");
		}

//		if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
//			System.out.println("거짓");
//		}
//
//		if (10 != 10 || 10 < 2) {
//			System.out.println("거짓");
//		}
		System.out.println("================================================\n\n");
		/*===================================================================================*/
		// 문제 : 할인 대상인지 아닌지 출력해주세요.
		// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
		// 조건 : 출력예시 처럼 출력되어야 합니다.
		// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
		// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
		// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.
		
		int age = 20; // 이 값을 바꿔가면서 실행해보세요.

	    System.out.println("당신의 나이는 " + age + "살 입니다.");

	    // 구현시작
	    //1번
	    if(age<=19 || age>=60) {
	    	System.out.println("할인대상입니다.");
	    }
	    else {
	    	System.out.println("할인 대상이 아닙니다.");
	    }
	    
	    //2번
	    if(age>19&&age<60) {
	    	System.out.println("할인 대상이 아닙니다.");
	    }
	    else {
	    	System.out.println("할인대상입니다.");
	    }
	    
	    //3번
	    if(age<=19) {
	    	System.out.println("할인대상입니다.");
	    }
	    else if(age>=60) {
	    	System.out.println("할인대상입니다.");
	    }
	    else {
	    	System.out.println("할인 대상이 아닙니다.");
	    }
	    
	    //4번
	    if(age>=60) {
	    	System.out.println("할인대상입니다.");
	    }
	    else if(age<=19) {
	    	System.out.println("할인대상입니다.");
	    }
	    else{
	    	System.out.println("할인 대상이 아닙니다.");
	    }

	    //5번
	    if(age<=19) {
	    	System.out.println("할인대상입니다.");
	    }
	    else if(age>=60) {
	    	System.out.println("할인대상입니다.");
	    }
	    else if(age>19&&age<60) {
	    	System.out.println("할인 대상이 아닙니다.");
	    }
	    
	    //6번
	    if(age>=60) {
	    	System.out.println("할인대상입니다.");
	    }
	    else if(age<=19) {
	    	System.out.println("할인대상입니다.");
	    }
	    else {
	    	System.out.println("할인 대상이 아닙니다.");
	    }
	    
	// 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
}}
