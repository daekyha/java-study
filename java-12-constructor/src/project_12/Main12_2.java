package project_12;

public class Main12_2 {
	public static void main(String[] args) {
		사람 a김철수 =new 김철수();
		a김철수.자기소개();
	
	
	
	}
}
class 사람{
	String 이름;
	int 나이;
	
//	사람(){
//		this.이름="김철수";
//		this.나이=22;
//	}
	사람(String name, int age){
		this.이름=name;
		this.나이=age;
	}
	void 자기소개() {
		System.out.println(this.이름);
		System.out.println(this.나이);
	}
	

}
class 김철수 extends 사람{
	김철수(){
		super("asd",10); //
	}
}

/*==================상속 및 생성자 기본 틀====================================*/
class A{
	A(){
	
	}
	//생략.
}
class B extends A{
	B(){
		super();
		//A의 기본 생성자가 사라지면 super를 통해 맞춰줘야됨.
		//얘를 통해 자식클래스가 생성되면 부모클래스를 호출하여 부모도 생성됨.
	}
	//생략.
}