package ex01;

public class Hello {

	// property
//	private String msg = "Hello World!!";
	private String msg;		// null값 출력됨 -> beans.xml에 property name 값 과 value 값을 주면 value값이 출력됨

	// get property
	public String getMsg() {
		return msg;
	}

	// set property
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
