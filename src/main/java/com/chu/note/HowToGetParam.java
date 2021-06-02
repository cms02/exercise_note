package com.chu.note;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chu.note.vo.testVo;

@Controller
public class HowToGetParam {
	
	@RequestMapping(value="/goToPageHTGP")
	public String goToPageHTGP() {
		return "howToGetParam";
	}
	

	@RequestMapping(value="/testRequestBody", method = {RequestMethod.POST,RequestMethod.GET})
	public String htgpRequestBody(@RequestBody testVo testVo) {
		
		System.out.println(testVo.getId());
		System.out.println(testVo.getName());
		System.out.println(testVo.getAge());
		
		return "home";
		
	}
	

}
