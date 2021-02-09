package com.sumit.crudapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sumit.crudapp.model.Student;
import com.sumit.crudapp.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = {"/"})
	public ModelAndView getHomePage(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listStudent", studentService.getAllStudent());
		mv.setViewName("Home");
		return mv;
	}
	
	@RequestMapping(value = {"/addstudentdetail"})
	public ModelAndView getAddStudentPage(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddStudent");
		mv.addObject("student", new Student());
		return mv;
	}
	
	@RequestMapping(value = {"/savestudent"})
	public String saveStudentDetail(@ModelAttribute @Valid Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "AddStudent";
		}
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping(value = {"/update/{studId}"})
	public String getStudentData(@PathVariable(value = "studId") long studId, Model model) {
		
		return "";
	}
}
