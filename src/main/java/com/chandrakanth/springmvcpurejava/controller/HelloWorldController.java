package com.chandrakanth.springmvcpurejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *  The classes annotated 
 */
@Controller
public class HelloWorldController {
   
   /*@RequestMapping(path={"/"},method=RequestMethod.GET)*/
	@GetMapping("/")
	public String sayHello(Model model) {
      model.addAttribute("message","HELLO WORLD");      
      return "index";
   }
	
	@PostMapping("/post/")
	public String sayHello(ModelMap modelMap) {
		return "";
	}
}
