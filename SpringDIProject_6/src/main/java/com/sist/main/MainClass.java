package com.sist.main;
import java.util.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.*;
import com.sist.vo.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@Test
	/*public void locationMain()
	{
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		LocationDAO dao=(LocationDAO)app.getBean("ldao");
		List<SeoulLocationVO> list=dao.locationListData();
		for(SeoulLocationVO vo:list)
		{
			System.out.println(vo.getNo()+"."+vo.getTitle());
		}
	}
	public void locationDetail()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("명소 번호:");
		int no=scan.nextInt();
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		LocationDAO dao=(LocationDAO)app.getBean("ldao");
		SeoulLocationVO vo=dao.locationDetailData(no);
		System.out.println("Title:"+vo.getTitle());
		System.out.println("Address:"+vo.getAddress());
		System.out.println("Message:"+vo.getMsg());
	}*/
	
	public void shopMain()
	{
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		ShopDAO dao=(ShopDAO)app.getBean("sdao");
		List<SeoulShopVO> list=dao.shopListData();
		for(SeoulShopVO vo:list)
		{
			System.out.println(vo.getNo()+"."+vo.getTitle());
		}
	}
	public void shopDetail()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("가게 번호:");
		int no=scan.nextInt();
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		ShopDAO dao=(ShopDAO)app.getBean("sdao");
		SeoulShopVO vo=dao.shopDetailData(no);
		System.out.println("Title:"+vo.getTitle());
		System.out.println("Address:"+vo.getAddress());
		System.out.println("Message:"+vo.getMsg());
	}

}
