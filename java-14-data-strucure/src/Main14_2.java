import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main14_2 {
	public static void main(String[] args) {
		 System.out.println("=== 11 ===");
		 Article[] artiecles = new Article[100];
		 
		 artiecles[0]=new Article();
		 artiecles[1]=new Article();

		 ArrayList<Article> article  = new ArrayList<Article>();  
		 // ArrayList<데이터 타입 제한(원타입), 생략가능> [변수명] = new ArrayList<데이터 타입 제한(원타입), 생략가능>();  
		 // 초기 사이즈 기입 필요 X
		 // 데이터 타입 마음대로 사용 가능.(정수, 문자열, 객체 저장가능) 
		 // => 때문에 사용시 수동형변환이 필요 (기본은 Object; 모든 데이터형 저장 가능)
		 
		 // 매서드
		 // 1. add 데이터 추가
		 // 2. get 데이터 불러옴.
		 // 3. size 저장된 데이터 사이즈
		 
		 // 컨트롤 쉬프트 o =>  import를 알아서 해줌
		 
		 List<Article> article1  = new ArrayList<>();
		 //List<데이터 타입 제한(원타입), 생략가능> [변수명] = new ArrayList<>();
		 // 리스트가 배열보다 좋은점
		 //초기 사이즈를 안정하고 사용 
		 //리스트를 만들면 최초 0, add할때마다 1 씩 증가
		 
			 
		 //향상된 for문
		// 순회할 수 있는 요소르 가지고 정순회를 해야할때(역순회는 불가함.)_
		 
		 int[] arr =new int[3];
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 for(int s : arr) {
			 System.out.println(s);
		 }
		 
		 //Map
		 //key : value -키와밸류의 한쌍
		 Map<String, Object> map = new HashMap<>();
		 map.put("첫번쨰키", 0);
		 map.put("두번쨰키", "ㅁㄴㅇㅁㅇㄴ");
		 map.put("세번쨰키", new Article());
			
		 System.out.println(map.get("첫번째키"));
		 //인덱스가 존재하지 않음 = 키로 찾음
		 
		 
		 
	}
}

class Article{
	
}
