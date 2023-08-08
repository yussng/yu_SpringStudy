package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

// no,title,poster,chef,link,hit
@Getter
@Setter
public class RecipeVO {
	private int no,hit;
	private String title,poster,chef,link;
}
