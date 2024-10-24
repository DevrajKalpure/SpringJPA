package com.nt;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.repositary.EmployeeRepository;
import com.nt.user.Employee;

@SpringBootApplication
public class SpringJpa001Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringJpa001Application.class, args);
		
		EmployeeRepository em=ctx.getBean(EmployeeRepository.class);
		/*
		 * //insert a record Employee e1= new Employee(); e1.setId(102);
		 * e1.setName("Shanu"); e1.setEmail("shanu@gmail.com"); e1.setAge(21);
		 * e1.setCity("Bhopal");
		 * 
		 * em.save(e1);
		 
		
		System.out.println("Records inserted");
		*/
		
		/*
		 * //retrieve a record 
		 * 
		 *  it returns optional
		 * Optional <Employee> op= em.findById(101);
		 * 
		 * if(op.isPresent()) { System.out.println(op.get());
		 * 
		 * }
		 */
		
		 //To retreive all records in a table
		System.out.println( em.findAll());
		 
		
		
		
		
		
	}

}
