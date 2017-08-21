package com.multicampus.ctl;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

public class RequestEncryptArgumentResolver implements WebArgumentResolver {

	@Override
	public Object resolveArgument(MethodParameter parameter, NativeWebRequest webRequest) throws Exception {
		
		Class<?> clazz = parameter.getParameterType();
		if(Map.class.isAssignableFrom(clazz)) {
			try {
				HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
				return process(request, clazz);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return UNRESOLVED;
		
	}
	
	private <M extends Map<String, Object>> M process(HttpServletRequest request, Class<?> clazz) throws Exception {
	
		if(Map.class.equals(clazz)) {
			clazz = HashMap.class;
		}
		
		@SuppressWarnings("unchecked")
		M map = (M) clazz.newInstance();
		
        Enumeration<String> enumeration = request.getParameterNames();
        
        String key = null;
        String[] values = null;
        while(enumeration.hasMoreElements()){
            key = (String) enumeration.nextElement();
            values = request.getParameterValues(key);
            if(values != null){
            	map.put(key, (values.length > 1) ? values:values[0] );
            }
            
            if("enc".equals(key)) {
            	map.put(key, "UMMMMMMM");
            }
        }
        return map;
	}
	
}
