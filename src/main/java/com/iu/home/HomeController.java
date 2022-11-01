package com.iu.home;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	

	
	@GetMapping("/")
	public String home() throws Exception {


		return "index";
	}

}
