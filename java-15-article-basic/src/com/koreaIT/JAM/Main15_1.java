package com.koreaIT.JAM;

import java.util.Scanner;

// 웹개발 시 com > koreaIT > JAM

public class Main15_1 {
	public static void main(String[] args) {
		System.out.println("==============프로그램 시작==============");
		
		Scanner sc=new Scanner(System.in);
		At[] 게시물 = new At[100];
		int count=0;
		
		while (true) {
			System.out.printf("명령어>");
			String cmd=sc.nextLine();
			
			if(cmd.equals("article list")) {
				if(count==0) {
					
					System.out.println("게시물이 존재하지 않습니다.");	
					
				}else {
					
					for(int i=count-1;i>=0;i--) {
						System.out.printf("%d	|	%s\n",i+1,게시물[i].제목);
					}
					
				}
			}else if(cmd.equals("article write")) {
				
				게시물[count]=new At();
				System.out.printf("제목 : ");
				게시물[count].제목=sc.nextLine();
				
				System.out.printf("내용 : ");
				게시물[count].내용=sc.nextLine();
				
				count++;
				System.out.println(count+ "번 게시물이 생성되었습니다.");
				
			}else if(cmd.equals("exit")) {
				
				break;
				
			}
	
		}
		
		sc.close();
		
		System.out.println("==============프로그램 종료==============");
	}
}

class At{
	String 제목;
	String 내용;
	At(){
		
	}
	At(String 제목, String 내용){
		this.제목=제목;
		this.내용=내용;
	}
	
	
}