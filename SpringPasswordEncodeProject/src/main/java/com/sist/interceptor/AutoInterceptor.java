package com.sist.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/*
 *    							 인터셉트(preHandle)			  인터셉트(postHandle)                    인터셉트(afterCompletion)
 * 	  요청 (.do) => DispatcherServlet ===> HandlerMapping ============================> ViewResolver =============> JSP
 * 									      @Controller/@RestController				return값을 받아서 화면 변경
 * 									      => @GetMapping, @PostMapping		
 * 
 *    Spring
 *      = setting : AOP/DI => 클래스 등록
 *      = ORM (Mybatis) ===============> 우대 (JPA)
 *         1) XML
 *         2) Annotation
 *         3) XML+Annotation(******)
 *      = Transaction
 *      ----------------
 *      = WebSocket
 *      = Security
 *      = Task
 *      ---------------- 옵션
 *      = MVC
 *      -----------------------------------------------
 *      
 *      = Front (HTML5, CSS, JavaScript)
 *      					 ----------
 *      						  |
 *      					  Jquery(Ajax) , VueJS , ReactJS
 *      					  => 우대 (NodeJS, AngularJS, TypeScript)
 *      = 우대 (Sprint-Cloud) => 개념 (MSA)
 */
public class AutoInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle Call...");
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle Call...");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion Call...");
		super.afterCompletion(request, response, handler, ex);
	}
	
}
