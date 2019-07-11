package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("text1") int num1, @RequestParam("text2") int num2)
	{
		ModelAndView mv= new ModelAndView();
		
		int result=num1+num2;
		mv.addObject("result",result);
		mv.setViewName("result.jsp");
		return mv;
	}

}
