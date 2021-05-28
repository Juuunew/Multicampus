package day09;

public class Member{
	private String id ;
	private String pw ;
	private String name;
	
	public Member() {
		super();
	}
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}

//3. WrongPasswordException 클래스만든다
//4. NotExistIDException 클래스만든다.

class WrongPasswordException extends Exception{
	public WrongPasswordException(){
		super("비밀번호를 확인해 주세요");
	}
	public WrongPasswordException(String msg){
		super(msg);
	}
}

class NotExistIDException extends Exception{
	public NotExistIDException(){
		super("ID를 확인해 주세요");
	}
	public NotExistIDException(String msg){
		super(msg);
	}
}
