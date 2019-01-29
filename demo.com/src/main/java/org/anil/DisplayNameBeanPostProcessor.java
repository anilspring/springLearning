package org.anil;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization (Object bean, String beanName)
	   throws BeansException {
		System.out.println(" In After initialization method .bean name ia "+beanName);
		return bean;
	}
	public Object postProcessBeforeInitialization (Object bean, String beanName)
			   throws BeansException {
				System.out.println(" In before initialization method .bean name ia "+beanName);
				return bean;
			}
}
