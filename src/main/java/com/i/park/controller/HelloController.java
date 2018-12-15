package com.i.park.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Properties;

/**
 * @author Think-pc
 *	
 * @RestController   返回json数据     添加这个后   不能返回页面
 * 
 * @Controller       标注这是一个servlet
 * 
 * @RequestMapping   映射
 *
 */

@Controller
//@RequestMapping("/page")
public class HelloController {

	@RequestMapping("/login")
	public String hello() {


		return "login";
	}




	@RequestMapping("/404")
	public String wrongPage() {
		
		
		return "404";
	}
	
 
	

	@RequestMapping("/index")
	public String index() {
		
		
		return "index";
	}

	///////////

}
