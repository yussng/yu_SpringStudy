package com.sist.web.service;
import java.util.*;

import com.sist.web.vo.FoodVO;
public interface FoodService {
	public List<FoodVO> foodFindData(Map map);
	
	public int foodfindTotalPage(String address);

}
