package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.SeoulNatureVO;
public interface SeoulMapper {
	// 목록
	@Select("SELECT no,title,poster,num "
			+ "FROM (SELECT no,title,poster,rownum as num " 
			+ "FROM (SELECT no,title,poster "
			+ "FROM seoul_nature ORDER BY no ASC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<SeoulNatureVO> seoulListData(Map map);
			
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM seoul_nature")
	public int seoulTotalPage();
	
	// 검색 => Vue/React => 실시간
	@Select("SELECT no,title,poster,num "  
			+ "FROM (SELECT no,title,poster,rownum as num " 
			+ "FROM (SELECT no,title,poster " 
			+ "FROM seoul_nature ORDER BY no ASC WHERE title LIKE '%'||#{title}||'%')) " 
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<SeoulNatureVO> seoulFindData(Map map);
}
