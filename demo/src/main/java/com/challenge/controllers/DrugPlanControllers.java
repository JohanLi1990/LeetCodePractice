package com.challenge.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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


	@GetMapping("/list-drugplans")
	public String getDrugPlans(ModelMap model) {
		// model only available for the scope of the current request
		String userID = (String)model.getAttribute("username");
		List<DrugPlan> list = drugPlanService.findByUserId(userID);
		model.addAttribute("listDrugPlans", list);
		return "listDrug";
	}
	
	@GetMapping("/add-drug")
	public String showNewDrug(ModelMap model) {
		model.addAttribute("drugplan", new DrugPlan());
		return "addDrug";
	}
	
	
	@PostMapping("/add-drug")
	public String addNewDrug(@Valid @ModelAttribute("drugplan") DrugPlan drugplan, BindingResult result, ModelMap model) {
		// add processing
		if (result.hasErrors()) {
			return "addDrug";
		}
		String userID = (String)model.getAttribute("username");
		drugplan.setUserid(userID);
		drugPlanService.save(drugplan);
		return "redirect:list-drugplans";
	}
	
	@RequestMapping("/delete-plan")
	public String deletePlan(@RequestParam String id) {
		
		drugPlanService.deletePlanById(Long.parseLong(id));
		return "redirect:list-drugplans";
	}
	
	@GetMapping("/update-plan")
	public String showUpdateDrugPlan(@RequestParam String id, ModelMap model) {
		DrugPlan d = drugPlanService.findById(id);
		model.addAttribute("drugplan", d);
		return "updateDrug";
	}
	
	
	@PostMapping("/update-plan")
	public String updateDrugPlan(@Valid  @ModelAttribute("drugplan") DrugPlan drugplan, BindingResult result, ModelMap model) {
		// add processing
		if (result.hasErrors()) {
			return "updateDrug";
		}
		drugPlanService.update(drugplan);
		return "redirect:list-drugplans";
	}
}
