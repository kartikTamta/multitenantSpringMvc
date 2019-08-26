package com.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.domain.model.Employee;
import com.domain.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/end",method=RequestMethod.GET)
	public ModelAndView getpage(){
    ModelAndView model=new ModelAndView("createEmployee");
	return model;
	}
	
	
	@RequestMapping(value = "viewEmployee", method = RequestMethod.GET)
    public String viewEmployee(ModelMap model) {
    model.addAttribute("employees", employeeService.list());
    return "viewEmployee";
    }
    
    @RequestMapping(value = "saveEmployee", method = RequestMethod.POST)
    public String saveEmployee(Employee employee) {
        employeeService.save(employee);
        return "redirect:viewEmployee";
    }
	
}
