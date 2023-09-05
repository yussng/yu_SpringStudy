package com.sist.web.vo;

import lombok.Getter;
import lombok.Setter;

/*
 *  NO int 
	TITLE text 
	POSTER text 
	MSG text 
	ADDRESS text 
	HIT int
 */
@Getter
@Setter
public class SeoulLocationVO {
	private int no,hit;
	private String title,poster,msg,address;
}
