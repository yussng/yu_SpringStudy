package com.sist.dao;
import java.util.*;

import org.mybatis.spring.support.SqlSessionDaoSupport;
public class FoodDAO extends SqlSessionDaoSupport{
	public List<FoodVO> foodFindData()
	{
		return getSqlSession().selectList("foodFindData");
	}
}
