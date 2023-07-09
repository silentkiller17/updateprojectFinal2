package com.example.FinalProjectSpringBoot.entity;

//Hibernate Persistence class
//Employee.java file
//creating employee persistence class(table)
import jakarta.persistence.*;

@Entity
public class Customer{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long customerId;
  private String customerName;
  private String customerAddress;
  private Long customermob;
  
  
public Customer(Long customerId, String customerName, String customerAddress, Long customermob) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.customermob = customermob;
}


public Customer() {
	
}


public Long getCustomerId() {
	return customerId;
}


public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}


public String getCustomerName() {
	return customerName;
}


public void setCustomerName(String customerName) {
	this.customerName = customerName;
}


public String getCustomerAddress() {
	return customerAddress;
}


public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}


public Long getCustomermob() {
	return customermob;
}


public void setCustomermob(Long customermob) {
	this.customermob = customermob;
}


public Object getCustomerMobile() {
	// TODO Auto-generated method stub
	return null;
}


public void setCustomerMobile(Object customerMobile) {
	// TODO Auto-generated method stub
	
}


  
}
