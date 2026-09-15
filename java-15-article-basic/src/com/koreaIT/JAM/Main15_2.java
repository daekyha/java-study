package com.koreaIT.JAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 웹개발 시 com > koreaIT > JAM

public class Main15_2 {
	public static void main(String[] args) {
		System.out.println("==============프로그램 시작==============");
		
		Scanner sc=new Scanner(System.in);
		List<At> 게시물 =new ArrayList<>();
		At 임시게시물=new At();
		int count=0;
		
		while (true) {
			System.out.printf("명령어>");
			String cmd=sc.nextLine();
			
			if(cmd.equals("article list")) {
				if(count==0) {
					
					System.out.println("게시물이 존재하지 않습니다.");	
					
				}else {
					System.out.println("번호    |   제목");
					for(int i=count-1;i>=0;i--) {
						System.out.printf("%d	|	%s\n",i+1,게시물.get(i).제목);
					}
					
				}
			}else if(cmd.equals("article write")) {
				
				System.out.printf("제목 : ");
				임시게시물.제목=sc.nextLine();
				
				System.out.printf("내용 : ");
				임시게시물.내용=sc.nextLine();
				
				게시물.add(임시게시물);
				
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

