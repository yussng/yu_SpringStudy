package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;
@Controller
public class SeoulController {
	@Autowired
	private SeoulDAO dao;
	
	@GetMapping("seoul/list.do")
	public String seoul_list()
	{
		return "seoul/list";
	}
}
