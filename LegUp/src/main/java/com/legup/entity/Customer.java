package com.legup.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	 private long id;
	 private String firstName;
	 private String lastName;
	 private String address;
	 private long moNumber;
	 private int pinCode; 
	 

}
