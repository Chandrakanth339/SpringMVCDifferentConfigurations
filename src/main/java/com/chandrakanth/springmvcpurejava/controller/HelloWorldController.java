package com.chandrakanth.springmvcpurejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
