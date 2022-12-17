package com.challenge.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.challenge.model.DrugPlan;

@Service
public class DrugPlanService {

	private static List<DrugPlan> drugPlans = new ArrayList<>();

	static {
		drugPlans.add(new DrugPlan("cy1", "drugId1", 2, LocalDate.now().plusDays(5L), 12));
		drugPlans.add(new DrugPlan("cy1", "drugId2", 2, LocalDate.now().plusDays(12L), 12));
	}
	
	public List<DrugPlan> findByUserId(String userID) {
		return drugPlans;
	}
}
