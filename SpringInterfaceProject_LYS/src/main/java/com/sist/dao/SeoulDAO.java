package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
import com.sist.vo.*;
@Repository
public class SeoulDAO {
	@Autowired
	private SeoulMapper mapper;
	
	/*@Select("SELECT no,title,poster,msg,address,num "
			+ "FROM (SELECT no,title,poster,msg,address,rownum as num " 
			+ "FROM (SELECT no,title,poster,msg,address "
			+ "FROM seoul_nature ORDER BY no ASC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")*/
	public List<SeoulNatureVO> seoulListData(Map map)
	{
		return mapper.seoulListData(map);
	}
			
	/*@Select("SELECT CEIL(COUNT(*)/12.0) FROM seoul_nature")*/
	public int seoulTotalPage()
	{
		return mapper.seoulTotalPage();
	}
	
	// 검색 => Vue/React => 실시간
	/*@Select("SELECT no,title,poster,msg,address,num "  
			+ "FROM (SELECT no,title,poster,msg,address,rownum as num " 
			+ "FROM (SELECT no,title,poster,msg,address " 
			+ "FROM seoul_nature ORDER BY no ASC WHERE address LIKE '%'||#{address}||'%' " 
			+ "WHERE num BETWEEN #{start} AND #{end}")*/
	public List<SeoulNatureVO> seoulFindData(Map map)
	{
		return mapper.seoulFindData(map);
	}
}
