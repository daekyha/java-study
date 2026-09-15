
public class Main05 {
	public static void main(String[] args) {
		int j=10;	// 정수형 타입 변수 a를 선언. 10이라는 값으로 초기화./ 변수는 오직 하나의 값만 가짐.
		
		int[] arr = new int [3];
		String[] str = new String[3];
	
		// 기본 자료형 타입 8개 이외는 참조형 데이터
		// int => 정수(단수)
		// int[] => 정수들(복수), 참조형 타입
		// arr => 변수명(array)
		// new => (예약어) "객체 하나를 만들겠다.", 
		// int[3] => new를 통해 만들어질 객체의 모양
		// itn[3] 모양으로 된 객체 하나를 만들고  arr라는 변수에 넣겠다.
		
		//객체-> 연관성있는 복수개의 테이터를 다루기 위한 문법
		
		arr[0/*Index 인덱스*/]=3;
		
		
		for(int i=0; i<3 ;i++) {                                                              
			System.out.println( arr[i] );                                                     
			                                                                                  
		}                                                                                     
		                                                                                      
		                                                                                      
		// [자료형]                                                                           
		// 정수형 : byte, short, int, long                                                    
		// 실수형 : float, double                                                             
		// 문자형 : char                                                                      
		// 논리형 : boolean                                                                   
		// 참조형(문자영) : String                                                            
		// [](배열)은 모든 데이터 타입에 가능함.                                              
		                                                                                      
		//		byte a=1;                                                                             
		//		short b=1;                                                                            
		//		int c=1;                                                                              
		//		long d=1L;                                                                            
		//		float e=1.1f; // 뒤에 f는 붙어줘야됨
		//		double f =1.1;
		//		char g='ㅣ'; // 한글자만
		//		boolean h=true;
		
		
		//배열에서만 가능한 행위
		str[0]="qwe";
		str[1]="asd";
		str[2]="zxc";
		//.을 찍으면 나오는 기본 메서드나 변수들은 객체라면 기본적으로 가지는 것....
		//.length 을 주로 사용함. (길이를 구하는 메서드)
		System.out.println(str.length); 
		
		int i=0;
		while(i<str.length) {
			System.out.println(str[i]);
			i++;
		}
		System.out.println("======================================================================");
		
		for(j=0;i<str.length ;i++) {
			System.out.println(str[i]);
		}
		
		for(j=str.length - 1;j>=0;j--) {
			System.out.println(str[j]);
		}
		
		//=============================================================================================================================
		
		int[] arr1 =new int[3];	//1차원 배열
		int[][] arr2=new int[3][2];	//2차원 배열
		int[][][] arr3=new int[3][2][3];	//3차원 배열
		
		
		
	}
		
}
