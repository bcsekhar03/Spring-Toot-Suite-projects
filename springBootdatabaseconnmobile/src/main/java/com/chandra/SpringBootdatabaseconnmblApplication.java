package com.chandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootdatabaseconnmblApplication implements CommandLineRunner {
@Autowired
private mobileRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootdatabaseconnmblApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*mobile m1=new mobile(101,"vivo","4gb",128,"s1pro","11",900,20000.00,32,64,5000.00,14,1234567896,"orange");	
		mobile m2=new mobile(102,"redmi","4gb",128,"m6pro","11",800,90000.00,13,34,4500.00,12,451214512,"green");	
		mobile m3=new mobile(103,"galaxy","8gb",158,"m2pro","10",950,15000.00,20,48,4500.00,12,781214512,"blue");	
        repo.save(m1);
        repo.save(m2);
        repo.save(m3);       
      System.out.println("New record inserted successfully.....!");*/
       /*System.out.println("...delete operation...");
       repo.deleteById(102);
       System.out.println("one record deleted");*/
		/*System.out.println("...update operation...");
		mobile oldmbl=repo.findById(103).get();
		oldmbl.setF_cam(48);
		oldmbl.setB_cam(68);
		repo.save(oldmbl);
		System.out.println("one record updated");*/
		/*System.out.println("...get one record...");
		mobile s2=repo.findById(103).get();
		System.out.println(s2);
		System.out.println("getting one record successfully");*/
		System.out.println("...get all records...");
		repo.findAll().forEach(student->{
			System.out.println(student);
			System.out.println("getting all records successfully");
		});
	}

}
