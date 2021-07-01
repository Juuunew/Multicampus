package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String a() {
		System.out.println("Hello Boot!!");
		return "Hello Boot";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		System.out.println("안녕하세요");
		
		return "html/hello.html";
	}
}
