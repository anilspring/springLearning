package org.anil;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
     private Point center;
     
     public void draw() {
    	 System.out.println("Drawing Circle");
    	System.out.println("circle: point is:(" + center.getX()+ " , " +center.getY()+ ")");
    			
   	}

	public Point getCenter() {
		return center;
	}
	/*@Autowired
	@Qualifier("circleRelated")*/
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	
	@PostConstruct
	public void destroyCircle() {
		System.out.println("destroy of circle");
	}
	
}
