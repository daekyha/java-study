package project_3;

public class Main03_2 {
	public static void main(String[] args) {
		int dan = 8;

		int i = 1;
		while(i<=1000){
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		
		System.out.println("\n================================================================================");
		
		i=-100;
		while(i<=25) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("\n================================================================================");
	
		i=1000;
		
		while(i>=1) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i--;
		}
		
		System.out.println("\n================================================================================");
		
		i =1000;
		while(i>=-500) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i--;
		} 
		
		System.out.println("\n================================================================================");
		
		i=1;
		int d;
		
		while(i<=10) {
			d=1;
			while(d<=3) {
				System.out.println(d);	d++;
			}
			i++;
		}
	}
}
