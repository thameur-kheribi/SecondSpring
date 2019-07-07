package com.ghazela.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ghazela.model.CustomerType;
import com.ghazela.repository.CustomerTypeRepository;

@Controller
public class HelloController {
	
	@Autowired
	CustomerTypeRepository customerTypeRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/ghazela/rest")
	public String HelloFromRestController() {
		return "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ " <h1>test from ghazela</h1>\r\n" + "</body>\r\n" + "</html>";
	}

	@RequestMapping("/ghazela/controller")
	public String HelloFromController() {
		return "index";
	}

}
