package com.multicampus.ctl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ResponseEncryptInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object obj, ModelAndView mav)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------- POST HANDLER --------------------");
		Map<String, Object> model = mav.getModel();
		model.put("ME", "BBBBBBEEE");
	}

}
