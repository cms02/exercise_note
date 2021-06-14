package com.chu.note;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chu.note.vo.testVo;

@Controller
public class HowToGetParam {

	@RequestMapping(value = "/goToPageHTGP")
	public String goToPageHTGP() {
		return "howToGetParam";
	}

	@RequestMapping(value = "/testRequestBody")
	public String htgpRequestBody(@RequestBody testVo testVo) {

//		System.out.println(testVo.getId());
//		System.out.println(testVo.getName());
//		System.out.println(testVo.getAge());*/
		System.out.println("gg"+testVo);
		return "home";

	}
	

	@RequestMapping(value = "/testRequestParam")
	public String htgpRequestParam(@RequestParam Map<String, Object> paramMap) {

		System.out.println(paramMap.get("id"));
		System.out.println(paramMap.get("name"));
		System.out.println(paramMap.get("age"));

		return "home";

	}

//	@RequestMapping(value = "/testRequestParam", method = { RequestMethod.POST, RequestMethod.GET })
//	public String htgpRequestParam(@RequestParam("id") String id) {
//
//		System.out.println(id);
//		return "home";
//
//	}

}
