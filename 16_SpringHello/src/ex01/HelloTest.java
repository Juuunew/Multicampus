package ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello h = new Hello();
		// Spring 객체가 있어야 getBean("xml의 id") 를 불러올 수 있음
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
		Hello h = (Hello) factory.getBean("h"); // DI = IoC (제어의 역전)	-> new = 개발자 제어 / factory.getBean = spring에서 제어
		Hello h2 = (Hello) factory.getBean("h2");
		
		System.out.println(h.getMsg());
		System.out.println(h2.getMsg());
		
		System.out.println(h == h2);
		
	}

}
