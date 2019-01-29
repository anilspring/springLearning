package org.anil;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context=null;
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	
	
	public void draw() {
		System.out.println("Point A=("+ getPointA().getX()+","+	getPointA().getY() +")");
		System.out.println("Point B=("+ getPointB().getX()+","+	getPointB().getY() +")");
		System.out.println("Point C=("+ getPointC().getX()+","+	getPointB().getY() +")");
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		System.out.println("inside ApplicationContext "+context);
		
	}

	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("BeanName is :"+ beanName);
	}

	public void destroy() throws Exception {
		System.out.println("Disposable destroy method is called");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method is called");
		
	}
    public void myInit() {
    	System.out.println("my init method is called");
    }
    public void cleanUp() {
    	System.out.println("my destroy method is called");
    }
}
