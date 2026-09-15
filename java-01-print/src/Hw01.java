
public class Hw01 {
	 public static void main(String[] args) {
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
		    System.out.println("안녕하세요.");
	
		    
		    System.out.println("===========================");
		    /*==========================================*/
		    
		    System.out.println("안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.");// println 1번 사용
		    
		    System.out.println("===========================");
		    /*==========================================*/
		    
		    System.out.println("안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n안녕하세요\n"); //역슬 활용
		    
		    System.out.println("===========================");
		    /*==========================================*/
		    
		   
		    int a= 5;
		    
		    System.out.println(a);
		    System.out.println(a + 10);
		    
		    int b = 10;
		    
		    System.out.println("a : " + a);
		    System.out.println("b : " + b);
		    
		    // 여기서 부터 
		    a=10;
		    b=5;
		    // 여기까지 수정 가능
		    
		    System.out.println("a : " + a);
		    // 출력 : a : 10
		    System.out.println("b : " + b);
		    // 출력 :  b : 5
		    
		    System.out.println("===========================");
		    /*==========================================*/
		 
		    int a2 = 5;
		    
		    System.out.println(a2);
		    System.out.println(a2 + 10);
		    
		    int b2 = 10;
		    
		    // `+` => 문장과 문자을 합친다.
		    System.out.println("a : " + a2);
		    System.out.println("b : " + b2);
		    
		    // 여기서 부터 
		    int tmp;
		    tmp=b2;
		    b2=a2;
		    a=tmp;
		    // 여기까지 수정 가능
		    
		    System.out.println("a : " + a2);
		    // 출력 : a : 10
		    System.out.println("b : " + b2);
		    // 출력 :  b : 5
		    
		    System.out.println("===========================");
		    /*==========================================*/
		    
		    
		  }
}
