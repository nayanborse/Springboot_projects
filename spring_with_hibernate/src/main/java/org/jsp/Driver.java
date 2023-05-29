package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.EntityManagerMessageLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
public static void main(String[] args) {
	EntityManagerFactory Factory = Persistence.createEntityManagerFactory("sheela");
	EntityManager Manager = Factory.createEntityManager();
	EntityTransaction Transaction = Manager.getTransaction();
	
	ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
	Student student = (Student)context.getBean("student");
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getPhone());
	System.out.println(student.getAddress());
	System.out.println(student.getEmail());
}
}
