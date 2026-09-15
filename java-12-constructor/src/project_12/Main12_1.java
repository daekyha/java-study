package project_12;

public class Main12_1 {
	public static void main(String[] args) {
		Player firstPlayer = new Player("name",10)/*(생성자 호출 방법 1번) 얘가 생성자임.*/;
		
		
	}
}
class Player{
	String name;
	int level;
	
	Player(String name, int level){
		this.name=name;
		this.level=level;
		//인자로 받고 데이터 백업 하는 역할으로 주로 사용함.
	}
	Player(int a){
		//this();/*(생성자 호출 방법 2번)얘가 생성자임. 무조건 첫번째 줄에 있어야됨. 재귀호출은 안됨. */
		System.out.println("인자가 있음");
	}

//	[생성자]
//	매서드의 일종
//	생성자는 리턴타입이 없음. (void도 안씀)
//	static 이라는 개념이 없음.
//  클래스명과 동일한 이름으로 명하면 생성자 인식.
//	우리가 원하는 곳에서 자유로운 호출이 불가함.(무조건 호출 못한다는 아님-[객체를 생성시] 및 [생성자 내 this])
//	기본생성자는 생략되어 있다.
//	생성자가 없으면 객체를 만들수 없기 때문에 생략되어 있는 개념(this를 생략해도 되는 이유와 동일함)
// 	생성자는 객체가 만들어짐과 동시에 한번 실행된다.
//	매개변수가 다르게 중복되게 만들 수 있음(오버로딩 개념)
//	이때 인자가 있는 객체를 만들려면 매개변수가 맞는 생성자를 실행함.

	
	
	void intro() {
		System.out.println();
	}
	
}