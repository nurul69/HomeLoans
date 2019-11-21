package com.lti.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Customer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer c_id;
	private String c_firstname;
	private String c_lastname;
	private String c_dob;
	private String c_gender;
	private String c_email;
	private String c_phone;
	private String c_address;
	private String c_city;
	private String c_state;
	private Integer c_zipcode;
	
	
	
	  @OneToOne(cascade = CascadeType.ALL) 
	  private Loan loan;
	 

	public Integer getC_id() {
		return c_id;
	}


	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}


	public String getC_firstname() {
		return c_firstname;
	}


	public void setC_firstname(String c_firstname) {
		this.c_firstname = c_firstname;
	}


	public String getC_lastname() {
		return c_lastname;
	}


	public void setC_lastname(String c_lastname) {
		this.c_lastname = c_lastname;
	}


	public String getC_dob() {
		return c_dob;
	}


	public void setC_dob(String c_dob) {
		this.c_dob = c_dob;
	}


	public String getC_gender() {
		return c_gender;
	}


	public void setC_gender(String c_gender) {
		this.c_gender = c_gender;
	}


	public String getC_email() {
		return c_email;
	}


	public void setC_email(String c_email) {
		this.c_email = c_email;
	}


	public String getC_phone() {
		return c_phone;
	}


	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}


	public String getC_address() {
		return c_address;
	}


	public void setC_address(String c_address) {
		this.c_address = c_address;
	}


	public String getC_city() {
		return c_city;
	}


	public void setC_city(String c_city) {
		this.c_city = c_city;
	}


	public String getC_state() {
		return c_state;
	}


	public void setC_state(String c_state) {
		this.c_state = c_state;
	}


	public Integer getC_zipcode() {
		return c_zipcode;
	}


	public void setC_zipcode(Integer c_zipcode) {
		this.c_zipcode = c_zipcode;
	}


	
	  public Loan getLoan() { return loan; }
	  
	  
	  public void setLoan(Loan loan) { this.loan = loan; }
	 

}