package com.springL1.assignment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import com.springL1.assignment2.modal.Branch;
import com.springL1.assignment2.modal.Service;
import com.springL1.assignment2.repository.BranchRepository;
import com.springL1.assignment2.repository.ServiceRepository;


import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class bankServiceController {
	
	@Autowired
	private BranchRepository branchRepository;
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@GetMapping("/branches")
	public String getBranches(Model model) {
		List<Branch> branches = branchRepository.findAll();
		model.addAttribute("bankName","State Bank Of India");
		model.addAttribute("branches", branches);
		return "branches";
	}
	
	@GetMapping("/services")
	public String getServices(Model model) {
		List<Service> services = serviceRepository.findAll();
		model.addAttribute("bankName","State Bank Of India Services");
		model.addAttribute("services", services);
		return "services";
	}
	
	

}
