package com.challenge.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

// Store in Database (MySql)
// Static List of todos => Database (H2, MySQL)

public class DrugPlan {
	
	
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String userid;
	
	@Size(min=10, message="Enter at least 10 Characters")
	private String drugid;
	private int quantity;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date targetDate;
	private int duration;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDrugid() {
		return drugid;
	}

	public void setDrugid(String drugid) {
		this.drugid = drugid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


}
