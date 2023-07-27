package com.sist.dao;
/*
 * 	service(interface) => serviceImpl => repository
 */
import java.util.*;

import org.mybatis.spring.support.SqlSessionDaoSupport; /*extends SqlSessionDaoSupport => mybatis연결하는*/

import com.sist.vo.EmpVO;
public class EmpDAO extends SqlSessionDaoSupport{
	/*
	 * <sql id="select-emp">
		 	SELECT empno,ename,job,TO_CHAR(hiredate,'YYYY-MM-DD') AS dbday,
		 	sal,dname,loc
		 	FROM emp,dept
		 	WHERE emp.deptno=dept.deptno
		 </sql>
		 <select id="empdeptlistData" resultMap="empMap">  <!-- 값을 받을 때 resultMap / vo에 값을 담는 resultType --> 
		 	<include refid="select-emp"/>
		 	ORDER BY sal DESC
		 </select>
		 <select id="empdeptDetailData" resultMap="empMap" parameterType="int">
		 	<include refid="select-emp"/>
		 	AND empno=#{empno}
		 </select>
	 */
	public List<EmpVO> empdeptListData()
	{
		return getSqlSession().selectList("empdeptListData");
	}
	public EmpVO empdeptDetailData(int empno)
	{
		return getSqlSession().selectOne("empdeptDetailData",empno);
	}
}
