package com.sist.web;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.dao.SeoulDAO;
import java.util.*;
import com.sist.vo.*;
@RestController
public class SeoulRestController {
	@Autowired
	private SeoulDAO dao;
	
	@GetMapping(value="seoul/list_vue.do",produces = "text/plain;charset=UTF-8")
	public String seoul_list_vue(String page)
	{
		System.out.println("진입");
		String result="";
		try
		{
			if(page==null)
				page="1";
			int curpage=Integer.parseInt(page);
			Map map=new HashMap();
			map.put("start", (curpage*12)-11);
			map.put("end", curpage*12);
			List<SeoulNatureVO> list=dao.seoulListData(map);
			int totalpage=dao.seoulTotalPage();
			// List => []
			// FoodLocationVO => {} => JSONObject
			// [{},{},{}...]
			JSONArray arr=new JSONArray();
			int i=0;
			// fno,name,poster,score
			/*
			 * {fno:1,name:"",poster:"",score:5.0}
			 */
			for(SeoulNatureVO vo:list)
			{
				JSONObject obj=new JSONObject();
				obj.put("no", vo.getNo());
				obj.put("title", vo.getTitle());
				obj.put("poster", vo.getPoster());
				if(i==0)
				{
					obj.put("curpage", curpage);
					obj.put("totalpage", totalpage);
				}
				
				arr.add(obj);
				i++;
			}
			result=arr.toJSONString();
		}catch(Exception ex) {ex.printStackTrace();}
		return result;
	}
	
}
