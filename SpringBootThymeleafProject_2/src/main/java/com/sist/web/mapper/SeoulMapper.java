package com.sist.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.web.vo.*;
@Repository
@Mapper
public interface SeoulMapper {
// <select id="seoulFindData" resultType="SeoulLocationVO" parameterType="hashmap">
	public List<SeoulLocationVO> seoulFindData(Map map);
// <select id="seoulFindTotalPage" resultType="int" parameterType="string">
	public int seoulFindTotalPage(String address);

}
