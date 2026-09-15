package com.koreaIT.JAM;

public class Member {
	private String Id;
	private String Pw;
	private String Pw_ck;
	private String name;
	public int Ckeck=0;
//	public Member(String Id, String Pw, String Pw_ck, String name){
//		this.Id=Id;
//		this.Pw=Pw;
//		this.Pw_ck=Pw_ck;
//		this.name=name;
//	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		if(id.length()==0) {
			System.out.println("아이디는 필수 입력항목입니다.");
			Ckeck++;
		}else{
			this.Id = id;
		}
	}
	
	public String getPw() {
		return Pw;
	}
	public void setPw(String pw) {
		if(pw.length()==0) {
			System.out.println("비밀번호는 필수 입력항목입니다.");
			Ckeck++;
		}else{	
			this.Pw = pw;
		}
		
	}
	
	public String getPw_ck() {
		return Pw_ck;
	}
	public void setPw_ck(String pw_ck) {
		if(pw_ck.length()==0) {
			System.out.println("비밀번호 확인은 필수 입력항목입니다.");
			Ckeck++;
		}else if(pw_ck.equals(this.Pw)==false) {
			System.out.println("비밀번호가 다릅니다.");
			Ckeck++;
		}else {
			this.Pw_ck = pw_ck;			
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()==0) {
			System.out.println("이름은 필수 입력항목입니다.");
			Ckeck++;
		}else{
			this.name = name;
		}
	}
	
}
