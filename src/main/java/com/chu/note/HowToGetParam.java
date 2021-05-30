package com.chu.note;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HowToGetParam {
	
	@RequestMapping(value="/goToPageHTGP")
	public String goToPageHTGP() {
		return "howToGetParam";
	}
	

	
	

}
