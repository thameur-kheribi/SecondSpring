package com.ghazela.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ghazela.model.Customer;
import com.ghazela.repository.CustomerRepository;
import com.ghazela.repository.CustomerTypeRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerTypeRepository customerTypeRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/")
	public String GetCustomer(Model model)
	{
		// Pass data to the model
		model.addAttribute("Customer", new Customer());
		model.addAttribute("CustTypes", customerTypeRepository.findAll());
		return "form";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/" )
	public String PostCustomer(@Valid @ModelAttribute("Customer") Customer customer,
			                   BindingResult result)
	{
		if (result.hasErrors())
			return "form";
		customerRepository.save(customer);
		return "form";
	}
}
