package web.vo;

public class MemberVO {
	private String id;
	private String pw;
	
	public MemberVO(String id, String pw) {
		super();
		setId(id);
		setPw(pw);
	}
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		// 유효성검사
		if(id != null) {
			this.id = id;
		} else {
			System.out.println("ID를 확인해주세요");
		}
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + "]";
	}
	
}
