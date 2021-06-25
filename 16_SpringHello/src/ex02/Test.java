package ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {
	// 객체 지향 설계 패턴!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
//		Shape c = (Shape) factory.getBean("c");
//		c.area();
//		
//		Shape r = (Shape) factory.getBean("r");
//		r.area();
//		
//		Shape t = (Shape) factory.getBean("t");
//		t.area();
		
//		Shape s = (Shape) factory.getBean("c");
//		s.area();
		
		
		// 재할당
//		s = (Shape) factory.getBean("r");
//		s.area();
//		
//		s = (Shape) factory.getBean("t");
//		s.area();
		
		Shape s = (Shape) factory.getBean(args[0]);
		s.area();
	}

}
