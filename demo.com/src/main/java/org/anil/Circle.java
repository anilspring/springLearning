package org.anil;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Controller
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
	@Resource
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
