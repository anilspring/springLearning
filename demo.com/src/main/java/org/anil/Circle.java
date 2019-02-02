package org.anil;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
     private Point center;
     public void draw() {
    	 System.out.println("Drawing Circle");
    	System.out.println("circle: point is:(" + center.getX()+ " , " +center.getY()+ ")");
    			
    	}

	public Point getCenter() {
		return center;
	}
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	
}
