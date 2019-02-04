package org.anil;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Controller
public class Circle implements Shape,ApplicationEventPublisherAware {
     private Point center;
     private ApplicationEventPublisher publisher;
     @Autowired
     private MessageSource messageSource;
     
     public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle",null, "Default Drawing Message",null));
		System.out.println(this.messageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()}, "Default Drawing Message",null));
    	//System.out.println(this.messageSource.getMessage("greeting",null, "Default Greeting",null));	
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
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

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	
}
