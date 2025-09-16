package com.chandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootdatabaseconnApplication implements CommandLineRunner {
@Autowired
private studentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootdatabaseconnApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
     /* student10 s1=new student10();	
       student10 s2=new student10(102,"srinu","springboot",19000.00);		
       student10 s3=new student10(103,"ganesh","hibernate",10000.00);		
       student10 s4=new student10(104,"sekhar","java",15000.00);		
       repo.save(s1);
       repo.save(s2);
       repo.save(s3);
       repo.save(s4);
      System.out.println("New record inserted successfully.....!"); */
       
        System.out.println("...delete operation...");
      // repo.deleteById(104);
       System.out.println("one record deleted");
      
		 System.out.println("...update operation...");
		student10 oldstudent=repo.findById(103).get();
		oldstudent.setFee(50000.00);
		oldstudent.setStdcourse("javascript");
		//repo.save(oldstudent);
		System.out.println("one record updated");
		
		System.out.println("...get one record...");
		student10 s=repo.findById(103).get();
		System.out.println(s);
		
		System.out.println("...get all records...");
		/*repo.findAll().forEach(student->{
			System.out.println(student);
		});*/
	}

}
