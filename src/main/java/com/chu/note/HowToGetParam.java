package com.chu.note;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chu.note.vo.testVo;

@Controller
public class HowToGetParam {
	
	@RequestMapping(value="/goToPageHTGP")
	public String goToPageHTGP() {
		return "howToGetParam";
	}
	

	@RequestMapping(value="/testRequestBody")
	public String htgpRequestBody(@RequestBody testVo testVo) {
		
		System.out.println(testVo.getId());
		System.out.println(testVo.getName());
		System.out.println(testVo.getAge());
		
		return "home";
		
	}
	
	@RequestMapping(value="/testRequestParam")
	public String htgpRequestParam(@RequestParam HashMap<String, String> paramMap) {
		
//		System.out.println(testVo.getId());
//		System.out.println(testVo.getName());
//		System.out.println(testVo.getAge());
		System.out.println(paramMap.get("id"));
		
		return "home";
		
	}

}
