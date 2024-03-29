package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.vo.*;
import com.sist.dao.*;
// Vue.React => router
@RestController // 데이터만 전송
public class MemberRestController {
	@Autowired
	private MemberDAO dao;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@GetMapping(value = "member/idcheck_ok_vue.do",produces = "text/plain;charset=UTF-8")
	public String member_idCheck(String id)
	{
		String result="";
		int count=dao.memberIdCheck(id);
		if(count!=0)
		{
			result="no";
		}
		else
		{
			result=id;
		}
		return result;
	}
	
	@GetMapping(value = "member/email_check_vue.do",produces = "text/plain;charset=UTF-8")
	public String member_emailCheck(String email)
	{
		String result="";
		int count=dao.memberEmailCheck(email);
		if(count!=0)
		{
			result="no";
		}
		else
		{
			result=email;
		}
		return result;
	}
	@PostMapping(value = "member/login_ok_vue.do",produces = "text/plain;charset=UTF-8")
	public String member_login(String id,String pwd,boolean ck,
			HttpSession session,HttpServletResponse response)
	{
		String result="";
		int count=dao.memberIdCheck(id);
		if(count==0)
		{
			result="NOID";
		}
		else
		{
			MemberVO vo=dao.memberInfoData(id);
			if(encoder.matches(pwd, vo.getPwd()))
			{
				result="OK";
				session.setAttribute("id", id);
				session.setAttribute("name", vo.getName());
				session.setAttribute("role", vo.getRole());
				if(ck==true)
				{
					Cookie cookie=new Cookie("id", id);
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24);
					response.addCookie(cookie);
					
					cookie=new Cookie("name", vo.getName());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24);
					response.addCookie(cookie);
					
					cookie=new Cookie("role", vo.getRole());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24);
					response.addCookie(cookie);
				}
			}
			else
			{
				result="NOPWD";
			}
		}
		return result;
	}
	@GetMapping(value = "member/logout_vue.do",produces = "text/plain;charset=UTF-8")
	public String member_logout(HttpSession session)
	{
		session.invalidate();
		return "";
	}
}
