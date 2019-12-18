package org.btmSpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container 
{
public static void main(String[] args)
{
	//this line is used to create the container------>
	ApplicationContext container= new ClassPathXmlApplicationContext("context.xml");
	System.out.println("container  is created");
	//Student obj=(Student) container.getBean("s1");
	//Student obj1=(Student) container.getBean("obj1");
	//System.out.println(obj1);
	// factory methods in the container  [getbean]
	Student s1=container.getBean("student", Student.class);
	System.out.println(s1);
}
}
