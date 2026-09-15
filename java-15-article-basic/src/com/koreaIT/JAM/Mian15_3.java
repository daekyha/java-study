package com.koreaIT.JAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mian15_3 {
	public static void main(String[] args) {
		System.out.println("==============프로그램 시작==============");
		
		Scanner sc=new Scanner(System.in);
		List<At> 게시물 =new ArrayList<>();
		int id;
		int count=0;
		
		// 테스트용 게시물 작성//
		게시물.add(new At("테스트용 1번","테스트 내용 1번"));
		count++;
		게시물.add(new At("테스트용 2번","테스트 내용 2번"));
		count++;
		게시물.add(new At("테스트용 3번","테스트 내용 3번"));
		count++;
		// 테스트용 3개 게시물 작성, 총 게시물 3개(변수 count:3)//
		
		
		while (true) {
			System.out.printf("명령어>");
			String cmd=sc.nextLine();
			
			if(cmd.equals("article list")) {
				//게시물 목록
				
				if(count==0) {
					
					System.out.println("게시물이 존재하지 않습니다.");	
					
				}else {
					System.out.println("번호    |   제목");
					for(int i=count-1; i>=0; i--) {
						System.out.printf("%d	|	%s\n",i+1,게시물.get(i).제목);
					}
					
				}
			}else if(cmd.equals("article write")) {		
				// 게시물 작성
				
				At 임시게시물=new At();
				
				System.out.printf("제목 : ");
				임시게시물.제목=sc.nextLine();
				System.out.printf("내용 : ");
				임시게시물.내용=sc.nextLine();
				
				System.out.printf("제목: %s | 내용: %s을 저장. \n",임시게시물.제목,임시게시물.내용);
				
				게시물.add(임시게시물);
				count++;
				System.out.println(count+ "번 게시물이 생성되었습니다.");
				
			}else if(cmd.startsWith("article detail")) {		
				// 게시물 상세보기
				
				String[] tmp=cmd.split(" ");
				
//				if(tmp.length<2) {
//					System.out.println("잘못된 명령어 입니다.");
//					continue;
//				}
//				
				id=Integer.parseInt(tmp[2]);
				
				if(count<id) {
					System.out.println(tmp[2]+"번 게시물은 존재하지 않습니다.");
				}else{
					System.out.println("====게시판 상세보기===");
					System.out.println("번호 : "+id);
					System.out.println("제목 : "+게시물.get(id-1).제목 );
					System.out.println("내용 : "+게시물.get(id-1).내용 );
				}
	
			}else if(cmd.startsWith("article modify")) {
				// 게시물 수정하기
				
				String[] tmp=cmd.split(" ");
				id=Integer.parseInt(tmp[2]);
				At 임시게시물=new At();

				if(count<id) {
					System.out.println(tmp[2]+"번 게시물은 존재하지 않습니다.");
				}else{
					System.out.printf("수정할 제목 : ");
					임시게시물.제목=sc.nextLine();
					System.out.printf("수정할 내용 : ");
					임시게시물.내용=sc.nextLine();
					System.out.printf("제목: %s | 내용: %s을 저장. \n",임시게시물.제목,임시게시물.내용);
					게시물.add(id-1,임시게시물);
					System.out.println(id+ "번 게시물이 수정되었습니다.");
				}
	
			}else if(cmd.startsWith("article delete")) {
				// 게시물 삭제하기
				
				String[] tmp=cmd.split(" ");
				id=Integer.parseInt(tmp[2]);

				if(count<id) {
					System.out.println(id+"번 게시물은 존재하지 않습니다.");
				}else{
					게시물.remove(id);
				}
	
			}else if(cmd.equals("exit")) {
				//프로그램 종료
				
				break;
			}
	
		}
		
		sc.close();
		System.out.println("==============프로그램 종료==============");
	}
}