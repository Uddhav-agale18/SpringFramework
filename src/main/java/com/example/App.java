package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.dao.StudentDao;
import com.example.entities.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My program started...");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/conn.xml");
		
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		Student student=new Student();
		student.setId(15153);
		student.setName("udit narayan");
		student.setCity("Patana");
		
		int result = studentDao.insert(student);
		System.out.println("student added "+result);

		
//		Student student=new Student();
//		student.setId(256);
//		student.setName("Mohit Kumar");
//		student.setCity("UP");
//		
//		int result = studentDao.change(student);
//		System.out.println("data changed "+result);

		
//		int result = studentDao.delete(256);
//		System.out.println("delete the data "+result);

	
	}

}
