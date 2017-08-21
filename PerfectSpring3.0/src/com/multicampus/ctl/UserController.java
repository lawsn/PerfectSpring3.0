package com.multicampus.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class UserController {
	
	@RequestMapping("user.do")
	public ModelAndView user(ModelMap model) {
		
		for(String key : model.keySet()) {
			System.out.printf("key=%s, value=%s\n", key, model.get(key));
		}
			
		System.out.println("ME.........");
		model.put("ME", "DOO");
		
		return new ModelAndView("user", "model", model);
	}
	
	@RequestMapping("enc.do")
	public ModelAndView enc(Map<String, Object> model) {
		
		for(String key : model.keySet()) {
			System.out.printf("key=%s, value=%s\n", key, model.get(key));
		}
		
		System.out.println("ME.........");
		model.put("ME", "DOO");
		
		return new ModelAndView("user", "model", model);
	}
	
	@RequestMapping("hash.do")
	public ModelAndView hash(HashMap<String, Object> model) {
		
		for(String key : model.keySet()) {
			System.out.printf("key=%s, value=%s\n", key, model.get(key));
		}
		
		System.out.println("ME.........");
		model.put("ME", "DOO");
		
		return new ModelAndView("user", "model", model);
	}
}
