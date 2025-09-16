package com.sekhar.convert;

import java.io.File;

import com.sekhar.bind.Address;
import com.sekhar.bind.Person;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class ConvertJavaToxml {

	public static void main(String[] args) throws Exception {
		
		/*Address add=new Address();
		add.setCity("kurnool");
		add.setState("A.P");
		add.setCountry("India");

		Person p=new Person();
		p.setId(11);
		p.setName("sekhar");
		p.setAge(24);
		p.setPhno(5461334662l);
        p.setAddr(add);*/
		
        File xmlfile=new File("person.xml");
		JAXBContext context=JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Object obj=unmarshaller.unmarshal(xmlfile);
		Person p1=(Person) obj;
		System.out.println(p1);
	}

}
