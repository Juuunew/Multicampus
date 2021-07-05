package com.prob.web.vo;

public class MemberVO {

	private String id;
	private String pw;
	private String name;
	
	public MemberVO(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		if(id != null) {
			this.id = id;
		} else {
			System.out.println("id를 확인해주세요");
		}
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}
