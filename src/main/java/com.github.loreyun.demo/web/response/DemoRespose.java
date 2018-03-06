package com.github.loreyun.demo.web.response;

import java.util.List;

/**
 * @Author: LoreYun
 * @Date: 2018/3/6 9:50
 * @Description:
 */
public class DemoRespose {
	private List emptyList;

	public List getEmptyList() {
		return emptyList;
	}

	public void setEmptyList(List emptyList) {
		this.emptyList = emptyList;
	}

	@Override
	public String toString() {
		return "DemoRespose{" +
				"emptyList=" + emptyList +
				'}';
	}
}
