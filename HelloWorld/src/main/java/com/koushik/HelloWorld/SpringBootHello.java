package com.koushik.HelloWorld;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHello {
	
	@GetMapping("/springBootHello")
	private String springBootHello()
	{
		return "Hello World";
	}

}
