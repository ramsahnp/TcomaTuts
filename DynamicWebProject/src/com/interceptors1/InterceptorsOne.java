package com.interceptors1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorsOne extends HandlerInterceptorAdapter 
{
	//private static final Logger logger = LoggerFactory.getLogger(RequestProcessingTimeInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//logger.info("hello");
		System.out.println("Pre Handled is called..");
	response.getWriter().print("Pre Handle method is caled:");
	return true;// If it return true it will hit the handlermapping class false won't allow to hit 
	}

}
