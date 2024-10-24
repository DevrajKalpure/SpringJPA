package com.nt.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	
	Integer id;
	String name;
	String email;
	Integer age;
	String city;
	

}
