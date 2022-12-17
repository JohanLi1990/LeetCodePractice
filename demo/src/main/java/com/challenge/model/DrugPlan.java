package com.challenge.model;

import java.time.LocalDate;

// Store in Database (MySql)
// Static List of todos => Database (H2, MySQL)
public class DrugPlan {

	private String userid;
	private String drugId;
	private int quantity;
	private LocalDate targetDate;
	private int duration;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public DrugPlan(String userid, String drugId, int quantity, LocalDate targetDate, int duration) {
		super();
		this.userid = userid;
		this.drugId = drugId;
		this.quantity = quantity;
		this.targetDate = targetDate;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "DrugPlan [userid=" + userid + ", drugId=" + drugId + ", quantity=" + quantity + ", targetDate="
				+ targetDate + ", duration=" + duration + "]";
	}

}
