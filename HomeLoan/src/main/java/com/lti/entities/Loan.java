package com.lti.entities;

import javax.persistence.*;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer l_id;
	private Integer l_amount;
	private Double l_roi;
	private Integer l_tenure;
	private String l_purpose;
	private String l_property_name;
	private String l_property_loc;
	private Integer l_property_cost;
	private Integer l_emi;

	/*
	 * @OneToOne(mappedBy ="loan" ) private Customer customer;
	 */

	public Integer getL_id() {
		return l_id;
	}

	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}

	public Integer getL_amount() {
		return l_amount;
	}

	public void setL_amount(Integer l_amount) {
		this.l_amount = l_amount;
	}

	public Double getL_roi() {
		return l_roi;
	}

	public void setL_roi(Double l_roi) {
		this.l_roi = l_roi;
	}

	public Integer getL_tenure() {
		return l_tenure;
	}

	public void setL_tenure(Integer l_tenure) {
		this.l_tenure = l_tenure;
	}

	public String getL_purpose() {
		return l_purpose;
	}

	public void setL_purpose(String l_purpose) {
		this.l_purpose = l_purpose;
	}

	public String getL_property_name() {
		return l_property_name;
	}

	public void setL_property_name(String l_property_name) {
		this.l_property_name = l_property_name;
	}

	public String getL_property_loc() {
		return l_property_loc;
	}

	public void setL_property_loc(String l_property_loc) {
		this.l_property_loc = l_property_loc;
	}

	public Integer getL_property_cost() {
		return l_property_cost;
	}

	public void setL_property_cost(Integer l_property_cost) {
		this.l_property_cost = l_property_cost;
	}

	public Integer getL_emi() {
		return l_emi;
	}

	public void setL_emi(Integer l_emi) {
		this.l_emi = l_emi;
	}

	/*
	 * public Customer getCustomer() { return customer; }
	 * 
	 * public void setCustomer(Customer customer) { this.customer = customer; }
	 */

	
}
