package com.cisc181.core;


public class PersonException extends Exception {
	
	private Person person;
	private Date DOB;
	
	public PersonException(Person person)  {
		this.person = person;
		
		
	}
	
	
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		DOB = DOB;
	}
	

}
