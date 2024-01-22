package com.courses.ITCourses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
