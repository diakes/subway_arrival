package com.example.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("thymeleaf/home");
		registry.addViewController("/").setViewName("thymeleaf/home"); // 시작페이지 url을 /가 아닌 home으로 바꿔줌
		registry.addViewController("/hello").setViewName("thymeleaf/hello");
		registry.addViewController("/login").setViewName("thymeleaf/login");
		// registry.addViewController("/welcome1").setViewName("thymeleaf/welcome1");
	}
	
	@RequestMapping("/welcome2")
	public String welcome() { 
		return "welcome"; 
	}

}