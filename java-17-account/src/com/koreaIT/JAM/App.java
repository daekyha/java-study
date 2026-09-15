package com.koreaIT.JAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.koreaIT.JAM.dto.Article;
import com.koreaIT.JAM.util.Util;

public class App {
	List<Article> articles;
	List<Member> members;

	int articleId;
	int memberId;

	App() {
		members = new ArrayList<>();
		articles = new ArrayList<>();
		articleId = 0;
		memberId = 0;
	}

	public void run() {
		System.out.println("== 프로그램 시작 ==");

		makeTestData(); // 테스트용 데이터 생성.
		Scanner sc = new Scanner(System.in); // 입력 변수 생성.

		while (true) {
			System.out.printf("명령어> ");
			String cmd = sc.nextLine().trim();
			
			if (cmd.equals("exit")) { 									// 프로그램 종료
				break;
			}
			if(cmd.length()==0) {
				System.out.println("명령어를 입력해주세요.");
				continue;
			}

			if (cmd.equals("article write")) { 							// 게시물 작성
				System.out.printf("제목 : ");			String title = sc.nextLine();
				System.out.printf("내용 : ");			String body = sc.nextLine();
				articles.add(new Article(++articleId, Util.getDateStr(), Util.getDateStr(), title, body));
				System.out.printf("%d번 글이 생성되었습니다\n", articleId);
				
			} else if (cmd.equals("article list")) { 					// 게시물 목록
				if (articles.size() == 0) {
					System.out.println("게시물이 존재하지 않습니다");
					continue;
				}

				System.out.println("번호	|	제목	|	작성일");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf("%d	|	%s	|%s\n", article.getId(), article.getTitle(),
							article.getUpdateDate());
				}

			} else if (cmd.startsWith("article detail ")) { 			// 게시물 상세
				int id = GetCmdNum(cmd);
				if(id==-1) {
					System.out.println("잘못된 명령어 입니다.");
					continue;
				}
				
				Article foundArticle = getArticleById(id);
				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
					continue;
				}

				System.out.println("== 게시물 상세보기 ==");
				System.out.printf("번호 : %d\n", foundArticle.getId());
				System.out.printf("작성일 : %s\n", foundArticle.getRegDate());
				System.out.printf("수정일 : %s\n", foundArticle.getUpdateDate());
				System.out.printf("제목 : %s\n", foundArticle.getTitle());
				System.out.printf("내용 : %s\n", foundArticle.getBody());

				
			} else if (cmd.startsWith("article modify ")) { 			// 게시물 수정
				int id = GetCmdNum(cmd);
				if(id==-1) {
					System.out.println("잘못된 명령어 입니다.");
					continue;
				}
				
				Article foundArticle = getArticleById(id);
				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
					continue;
				}

				System.out.printf("수정할 제목 : ");	String title = sc.nextLine();
				System.out.printf("수정할 내용 : ");	String body = sc.nextLine();

				foundArticle.setTitle(title);
				foundArticle.setBody(body);
				foundArticle.setUpdateDate(Util.getDateStr());
				System.out.printf("%d번 게시물을 수정했습니다\n", id);

				
			} else if (cmd.startsWith("article delete ")) { 			// 게시물 삭제
				int id = GetCmdNum(cmd);	
				if(id==-1) {
					System.out.println("잘못된 명령어 입니다.");
					continue;
				}
				
				Article foundArticle = getArticleById(id);
				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
					continue;
				}

				articles.remove(foundArticle);
				System.out.printf("%d번 게시물을 삭제했습니다\n", id);
				
			}else if (cmd.equals("member join")) { 						// 회원가입
				
				while(true) {
					Member 임시 = new Member();
					System.out.printf("아이디 : ");				임시.setId(sc.nextLine().trim());
					if(임시.Ckeck != 0) {
						System.out.println("다시 입력하세요.");
						continue;
					}
					System.out.printf("비밀번호 : ");			임시.setPw(sc.nextLine().trim());
					if(임시.Ckeck != 0) {
						System.out.println("다시 입력하세요.");
						continue;
					}
					System.out.printf("비밀번호 확인 : ");		임시.setPw_ck(sc.nextLine().trim());
					if(임시.Ckeck != 0) {
						System.out.println("다시 입력하세요.");
						continue;
					}
					System.out.printf("이름 : ");				임시.setName(sc.nextLine().trim());
					if(임시.Ckeck != 0) {
						System.out.println("다시 입력하세요.");
						continue;
					}
					members.add(임시);
					//members.add(new Member(Id,Pw,Pw_ck,name));
					
					System.out.println("회원가입이 완료되었습니다.");
					break;
				}
			}
				
		

		
		sc.close();
		System.out.println("== 프로그램 끝 ==");
		}

	}


	private int GetCmdNum(String cmd) {
		String[] cmdBits = cmd.split(" ");
		try {
			return Integer.parseInt(cmdBits[2]);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	private Article getArticleById(int id) {
		for (Article article : articles) {
			if (id == article.getId()) {
				return article;
			}
		}
		return null;
	}

	private void makeTestData() {
		System.out.println("테스트용 게시물 데이터 3개를 생성했습니다");
		for (int i = 1; i <= 3; i++) {
			articles.add(new Article(++articleId, Util.getDateStr(), Util.getDateStr(), "제목" + i, "내용" + i));
		}
	}
}
