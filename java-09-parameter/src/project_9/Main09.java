package project_9;

public class Main09 {
	public static void main(String[] args) {
			int a=Cal.sum(10,new Cal());
			System.out.println(a);
		
		}
}

class Cal{
	static Cal bb;
	
	static int sum(int a, Cal b) {  // 리턴타입 :void ->int로 변경후 retrun 할 값을 지정.
		// 매개변수는 지역변수의 일종.
		// 매서드가 실행될 때 생성,
		// 근데 왜 초기화 x? 위에서 넣어주기 때문에 가능.
		System.out.println("??/");
		return a;
		// 메서드는 무조건 하나의 리턴만 할 수 있다.
		// 그러나, 하나의 리턴만 가져야 한다는 아님./
		
	}
	static void sum(){
	}
}