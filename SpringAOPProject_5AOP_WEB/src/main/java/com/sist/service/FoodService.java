package com.sist.service;

import java.util.List;

import com.sist.vo.CategoryVO;
import com.sist.vo.FoodVO;
import com.sist.vo.SeoulVO;

public interface FoodService {
	// 의존성 약하게 만든다
	public List<CategoryVO> foodCategoryData();
	public List<FoodVO> foodTop7();
	public List<SeoulVO> seoulTop7();
}
