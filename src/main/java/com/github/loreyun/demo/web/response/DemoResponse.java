package com.github.loreyun.demo.web.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: LoreYun
 * @Date: 2018/3/6 9:50
 * @Description:
 */
public class DemoResponse {
	private class NullListInBean {
		private List nulllListInBean;

		public List getNulllListInBean() {
			return nulllListInBean;
		}

		public void setNulllListInBean(List nulllListInBean) {
			this.nulllListInBean = nulllListInBean;
		}
	}

	private List nullList;
	private String nullString;
	private NullListInBean bean;
	private List<NullListInBean> nullListInList;
	private HashMap<String,List>  nullListInMap;

	public DemoResponse() {
		this.bean = new NullListInBean();

		this.nullListInList = new ArrayList<>();
		this.nullListInList.add(new NullListInBean());

		this.nullListInMap = new HashMap<>();
		this.nullListInMap.put("nullInMap", null);
	}

	public List getNullList() {
		return nullList;
	}

	public void setNullList(List nullList) {
		this.nullList = nullList;
	}

	public String getNullString() {
		return nullString;
	}

	public void setNullString(String nullString) {
		this.nullString = nullString;
	}

	public NullListInBean getBean() {
		return bean;
	}

	public void setBean(NullListInBean bean) {
		this.bean = bean;
	}

	public List<NullListInBean> getNullListInList() {
		return nullListInList;
	}

	public void setNullListInList(List<NullListInBean> nullListInList) {
		this.nullListInList = nullListInList;
	}

	public HashMap<String, List> getNullListInMap() {
		return nullListInMap;
	}

	public void setNullListInMap(HashMap<String, List> nullListInMap) {
		this.nullListInMap = nullListInMap;
	}

	@Override
	public String toString() {
		return "DemoResponse{" +
				"nullList=" + nullList +
				", nullString='" + nullString + '\'' +
				", bean=" + bean +
				", nullListInList=" + nullListInList +
				", nullListInMap=" + nullListInMap +
				'}';
	}
}
