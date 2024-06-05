package com.xyz.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Adding_CSS_JS_ImgController {

	@RequestMapping("/add")
	public String AddContent() {
		return "add";
	}
}
