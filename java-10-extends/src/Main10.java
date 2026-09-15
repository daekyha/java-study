
public class Main10 {
	public static void main(String[] args) {
		사람 a사람= new 사람();
		a사람.숨쉬다();
	
		

	}
}

class 동물{
	String 이름;
	void 숨쉬다() {
		System.out.println("==22=");
	}
}
class 사람 extends 동물{
	// 사람 클래스에 숨쉬다라는 매서드를 생성하지 않고 하는 방법.
	// 상속 : 자식 클래스명 뒤에 extends (부모 클래스명) 코드의 재사용성.
	//	물려주는 클래스 - 부모 클래스, super class
	//	물려받는 클래스 - 자식 클래스, sub class
	
	//!주의사항!
	// 상속관계 A is B(사람 is 동물)
	// 역의 관계는 성립되지 않음/. AB Test를 통과해야만 상속이 가능함.
	// 자바의 모든 클래스는 object라는 클래스에서 상속받는다.
	// 객체로 시작해서 객체로 끝남.
	
	// 하위관계가 이어지다가 상위관계로 이어지는 등 관계가 꼬여버리면 겉잡을 수 없음.
	// 때문에 클래스 명명도 역할에 맞게 지어줘야됨.
	// 서로를 상속하는 관계는 불가능

	
	void 숨쉬다() {
		System.out.println("==1=");
	}
	//오버라이딩
	// 부모가 물려준 매서드를 자식입장에서 재정의하여 사용하겠다.
	
	
	void 숨쉬다(int a) {
		System.out.println("==1=");
	}
	//오버로딩/.
	//이거는 매개변수가 다르기 때문에 오버로딩임.
}
