package com.sist.web.service;
import java.util.*;

import com.sist.web.vo.SeoulLocationVO;
public interface SeoulService {
	public List<SeoulLocationVO> seoulFindData(Map map);
	public int seoulFindTotalPage(String address);


}
