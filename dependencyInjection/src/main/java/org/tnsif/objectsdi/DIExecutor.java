package org.tnsif.objectsdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.dependencyinjection.Employee;

public class DIExecutor {

	public static void main(String[] args) {
		ApplicationContext b=new ClassPathXmlApplicationContext("web.xml");
		Student e=b.getBean("e1",Student.class);
		e.print();
		

	}

}
