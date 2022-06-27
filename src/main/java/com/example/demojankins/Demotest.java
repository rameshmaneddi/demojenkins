package com.example.demojankins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demotest {
	@GetMapping("/test")
	public String test()
	{
		return "hello";
	}

}
