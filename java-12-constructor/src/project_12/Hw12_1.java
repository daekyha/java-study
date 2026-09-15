package project_12;

public class Hw12_1 {
	public static void main(String[] args) {
		// 문제 - 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 해주세요.(매개변수 금지)
		전사 a전사 = new 전사();

		String 이름 = "칸";
		a전사.이름 = 이름;
		a전사.나이 = 20;
		a전사.자기소개();

		a전사.나이++;
		a전사.자기소개();

		a전사.나이 = 30;
		a전사.이름 = "카니";
		a전사.자기소개();

		a전사.a무기 = new 활();
		a전사.공격();
		// 출력 : 카니가 활로 공격합니다.

		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 : 카니가 칼로 공격합니다.
	}
}

class 전사 {
	// 인스턴스 변수
	String 이름;
	// 인스턴스 변수
	int 나이;
	// 인스턴스 변수
	무기 a무기;

	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
	}
	void 공격() {
		this.a무기.공격(this.이름);
	}
}

class 무기 {
	void 공격(String name) {
		
	}
}

class 칼 extends 무기 {
	void 공격(String name) {
		System.out.println(name+ "가 활로 공격합니다.");
	}
}

class 활 extends 무기 {
	void 공격(String name) {
		System.out.println(name+ "가 칼로 공격합니다.");
	}

}