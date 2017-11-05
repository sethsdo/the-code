package com.setholmstead.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors, Model model) {
		System.out.println(errors);
		model.addAttribute("error", errors);
		return "index";
	}
	
	@PostMapping("/check")
	public String check(
			@RequestParam(value="code") String code,
			RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("errors", "You Must Train Harder!");
		System.out.println(code);
		if(code.equals("bushido")) {
			return "redirect:/code";
		}
		else {
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String code() {
		return "display";
	}
	
	

}
