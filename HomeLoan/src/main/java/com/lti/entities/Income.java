package com.lti.entities;

import javax.persistence.*;

@Entity
public class Income {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer i_id;

	private String i_type;
	private Integer i_monthly_sal;
	private Integer i_other_income;
	private Integer i_existing_emi;

	public Integer getI_id() {
		return i_id;
	}

	public void setI_id(Integer i_id) {
		this.i_id = i_id;
	}

	public String getI_type() {
		return i_type;
	}

	public void setI_type(String i_type) {
		this.i_type = i_type;
	}

	public Integer getI_monthly_sal() {
		return i_monthly_sal;
	}

	public void setI_monthly_sal(Integer i_monthly_sal) {
		this.i_monthly_sal = i_monthly_sal;
	}

	public Integer getI_other_income() {
		return i_other_income;
	}

	public void setI_other_income(Integer i_other_income) {
		this.i_other_income = i_other_income;
	}

	public Integer getI_existing_emi() {
		return i_existing_emi;
	}

	public void setI_existing_emi(Integer i_existing_emi) {
		this.i_existing_emi = i_existing_emi;
	}

	public Income(Integer i_id, String i_type, Integer i_monthly_sal, Integer i_other_income, Integer i_existing_emi) {
		super();
		this.i_id = i_id;
		this.i_type = i_type;
		this.i_monthly_sal = i_monthly_sal;
		this.i_other_income = i_other_income;
		this.i_existing_emi = i_existing_emi;
	}

}
