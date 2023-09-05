package com.sist.web.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.web.mapper.SeoulMapper;
import com.sist.web.vo.SeoulLocationVO;

@Service
public class SeoulServiceImpl implements SeoulService{
	@Autowired
	private SeoulMapper mapper;

	@Override
	public List<SeoulLocationVO> seoulFindData(Map map) {
		// TODO Auto-generated method stub
		return mapper.seoulFindData(map);
	}

	@Override
	public int seoulFindTotalPage(String address) {
		// TODO Auto-generated method stub
		return mapper.seoulFindTotalPage(address);
	}
	

}
