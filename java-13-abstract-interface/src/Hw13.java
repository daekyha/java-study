
public class Hw13 {
	public static void main(String[] args) {
		
		// 조건 : 배열을 사용할 수 없습니다.
		
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
	}
}

class 사람인력관리소{
	int num =1;					// 번호 카운트 하는 변수 
	사람 인부1, 인부2, 인부3;
	
	void add사람(String name, int age) {
		if(this.num==1) {
			this.인부1 =new 사람(this.num,age,name);
		}else if(this.num==2) {
			this.인부2 =new 사람(this.num,age,name);			
		}else {
			this.인부3 =new 사람(this.num,age,name);					
		}
		
		
		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n",age,num,name);
		this.num++;
	}
	
	사람 get사람(int num) {
		if(num==1) {
			return this.인부1; 
		}else if(num==2) {
			return this.인부2;	
		}else {
			return this.인부3;				
		}
	}
	
}

class 사람{
	int num;
	int age;
	String name;
	
	사람(int num, int age, String name){
		this.num=num;
		this.age=age;
		this.name=name;
	}
	
	void 자기소개() {
		System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.num,this.name,this.age);
	}
	
}