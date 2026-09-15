
public class Hw11_2 {
	public static void main(String[] args) {
		    
		    샤오미Tv a샤오미Tv = new 샤오미Tv();
		    삼성Tv a삼성Tv = new 삼성Tv();
		    LGTv aLGTv = new LGTv();
		    
		    System.out.println("== 표준Tv 리모콘 들여온 후 ==");
		    
		    // 표준Tv 리모콘을 만든다.
		    표준Tv a표준Tv;
		    
		    // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
		    a표준Tv = a샤오미Tv;
		    a표준Tv.켜기();
		    // 출력 : 샤오기TV 켜집니다.
		    a표준Tv.끄기();
		    // 출력 : 샤오기TV 꺼집니다.
		    
		    // a표준Tv 변수에 삼성Tv 객체를 연결한다.
		    a표준Tv = a삼성Tv;
		    a표준Tv.켜기();
		    // 출력 : 삼성TV 켜집니다.
		    a표준Tv.끄기();
		    // 출력 : 삼성TV 꺼집니다.
		    
		    // a표준Tv 변수에 LGTv 객체를 연결한다.
		    a표준Tv = aLGTv;
		    a표준Tv.켜기();
		    // 출력 : LGTV 켜집니다.
		    a표준Tv.끄기();
		    // 출력 : LGTV 꺼집니다.
		    
		    // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
		    // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
		    LGTv aLGTv2 = (LGTv)a표준Tv;
		    aLGTv2.게임모드전환();
	    
	    
	}
}

class 표준Tv{
	String name;
	void 켜기() {
	}
	void 끄기() {
	}
}

class 샤오미Tv extends 표준Tv{
	void 켜기() {
		System.out.println("샤오미Tv 켜집니다.");
	}
	void 끄기() {
		System.out.println("샤오미Tv  꺼집니다.");
	}
	void vr켜기() {
		System.out.println("샤오미Tv  vr켜기!");
	}
}

class 삼성Tv extends 표준Tv{
	void 켜기() {
		System.out.println("삼성Tv 켜집니다.");
	}
	void 끄기() {
		System.out.println("삼성Tv  꺼집니다.");
	}
	void ar켜기() {
		System.out.println(this.name+" ar켜기!");
	}
}

class LGTv extends 표준Tv{
	void 켜기() {
		System.out.println("LGTv 켜집니다.");
	}
	void 끄기() {
		System.out.println("LGTv  꺼집니다.");
	}
	void 게임모드전환() {
		System.out.println(this.name+" 게임모드전환!");
	}
}