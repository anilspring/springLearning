package org.anil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
	  ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
		/*AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();*/
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		

	}

}
