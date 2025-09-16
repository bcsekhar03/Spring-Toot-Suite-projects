package com.chandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootdatabaseconnEmpApplication implements CommandLineRunner {
@Autowired
private employeeRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootdatabaseconnEmpApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*employeecrud e1=new employeecrud(101,"chandra","chandra@12gmail.com","9347100587","male","ygr",1234,"techno","manager");	
		employeecrud e2=new employeecrud(102,"srinu","srinu@22gmail.com","8847100525","male","knl",3214,"wipro","ceo");		
		employeecrud e3=new employeecrud(103,"ganesh","ganesh@552gmail.com","8847107894","male","kkn",4563,"adn","teamleader");		
        repo.save(e1);
        repo.save(e2);
        repo.save(e3);       
      System.out.println("New record inserted successfully.....!");*/
      /* System.out.println("...delete operation...");
       repo.deleteById(102);
       System.out.println("one record deleted");*/
		/*System.out.println("...update operation...");
		employeecrud oldemp=repo.findById(103).get();
		oldemp.setAddr("ygr");
		oldemp.setDesignation("teamassist");
		repo.save(oldemp);
		System.out.println("one record updated");*/
		/*System.out.println("...get one record...");
		employeecrud s2=repo.findById(103).get();
		System.out.println(s2);*/
		System.out.println("...get all records...");
		repo.findAll().forEach(student->{
			System.out.println(student);
			System.out.println("getting all records successfully");
		});
	}

}
