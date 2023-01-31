package com.challenge.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.challenge.model.DrugPlan;

@Service
public class DrugPlanService {

	private static List<DrugPlan> drugPlans = new ArrayList<>();
	private static AtomicLong size = new AtomicLong(0);

	static {
		DrugPlan d1 = new DrugPlan();
		DrugPlan d2 = new DrugPlan();
		populate(d1, size.getAndIncrement(), "cy1", "oxycodonoe", 2, 12);
		populate(d2, size.getAndIncrement(), "cy1", "ipbrofen tablet", 2, 5);
		drugPlans.add(d1);
		drugPlans.add(d2);
	}
	
	public List<DrugPlan> findByUserId(String userID) {
		return drugPlans;
	}
	
	private static void populate(DrugPlan d1, long id, String username, String drugName, int quantity, int duration) {
		d1.setId(id);
		d1.setUserid(username);
		d1.setDrugid(drugName);
		d1.setQuantity(quantity);
		d1.setDuration(duration);
		d1.setTargetDate(new Date(System.currentTimeMillis()));
	}
	
	public static void addDrug(String username, String drugName, int quantity, int duration) {
		// create entity for user and Drug
		// findDrugByDrugName, if cannot be find, user need to create one. 
		DrugPlan d1 = new DrugPlan();
		d1.setId(size.getAndIncrement());
		d1.setUserid(username);
		d1.setDrugid(drugName);
		d1.setQuantity(quantity);
		d1.setDuration(duration);
		drugPlans.add(d1);
	}
	
	public void save(DrugPlan d1) {
		d1.setId(size.getAndIncrement());
		drugPlans.add(d1);
	}

	public void deletePlanById(long l) {
		drugPlans.removeIf(k -> k.getId()==l);
	}

	public DrugPlan findById(String id) {
		Optional<DrugPlan> d1 = drugPlans.stream()
				.filter(k -> k.getId() == Long.parseLong(id))
				.findFirst();
		return d1.isPresent() ? d1.get() : null;
		
	}

	public void update(@Valid DrugPlan drugplan) {
		deletePlanById(drugplan.getId());
		drugPlans.add(drugplan);
	}
}
