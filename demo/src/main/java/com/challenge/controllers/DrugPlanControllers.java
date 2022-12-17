package com.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.challenge.model.DrugPlan;
import com.challenge.services.DrugPlanService;

@Controller
@SessionAttributes("username")
public class DrugPlanControllers {

	private DrugPlanService drugPlanService;
	
	
	@Autowired
	public DrugPlanControllers(DrugPlanService drugPlanService) {
		super();
		this.drugPlanService = drugPlanService;
	}


	@GetMapping("list-drugplans")
	public String getDrugPlans( @RequestParam("user") String userID, Model model) {
		// model only available for the scope of the current request
		List<DrugPlan> list = drugPlanService.findByUserId(userID);
		model.addAttribute("listDrugPlans", list);
		return "listDrug";
	}
}
