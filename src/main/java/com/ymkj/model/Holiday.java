package com.ymkj.model;

/**
 * 普通假期类
 * @author yuanGe
 *
 */
public class Holiday {
	private Integer id;
	private Integer user_id;
	private Integer day_0;
	private Integer day_1;
	private Integer day_2;
	private Integer day_3;
	private Integer day_4;
	private Integer day_5;
	private Integer day_6;
	private Integer day_7;
	private String where_to_go;
	private String remarks;
	private String holiday_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getDay_0() {
		return day_0;
	}
	public void setDay_0(Integer day_0) {
		this.day_0 = day_0;
	}
	public Integer getDay_1() {
		return day_1;
	}
	public void setDay_1(Integer day_1) {
		this.day_1 = day_1;
	}
	public Integer getDay_2() {
		return day_2;
	}
	public void setDay_2(Integer day_2) {
		this.day_2 = day_2;
	}
	public Integer getDay_3() {
		return day_3;
	}
	public void setDay_3(Integer day_3) {
		this.day_3 = day_3;
	}
	public Integer getDay_4() {
		return day_4;
	}
	public void setDay_4(Integer day_4) {
		this.day_4 = day_4;
	}
	public Integer getDay_5() {
		return day_5;
	}
	public void setDay_5(Integer day_5) {
		this.day_5 = day_5;
	}
	public Integer getDay_6() {
		return day_6;
	}
	public void setDay_6(Integer day_6) {
		this.day_6 = day_6;
	}
	public Integer getDay_7() {
		return day_7;
	}
	public void setDay_7(Integer day_7) {
		this.day_7 = day_7;
	}
	public String getWhere_to_go() {
		return where_to_go;
	}
	public void setWhere_to_go(String where_to_go) {
		this.where_to_go = where_to_go;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getHoliday_name() {
		return holiday_name;
	}
	public void setHoliday_name(String holiday_name) {
		this.holiday_name = holiday_name;
	}
	public Holiday(Integer id, Integer user_id, Integer day_0, Integer day_1, Integer day_2, Integer day_3,
			Integer day_4, Integer day_5, Integer day_6, Integer day_7, String where_to_go, String remarks,
			String holiday_name) {
		this.id = id;
		this.user_id = user_id;
		if(day_0 == null) {
			this.day_0 = 0;
		}else {
			this.day_0 = 1;
		}
		if(day_1 == null) {
			this.day_1 = 0;
		}else {
			this.day_1 = 1;
		}
		if(day_2 == null) {
			this.day_2 = 0;
		}else {
			this.day_2 = 1;
		}
		if(day_3 == null) {
			this.day_3 = 0;
		}else {
			this.day_3 = 1;
		}
		if(day_4 == null) {
			this.day_4 = 0;
		}else {
			this.day_4 = 1;
		}
		if(day_5 == null) {
			this.day_5 = 0;
		}else {
			this.day_5 = 1;
		}
		if(day_6 == null) {
			this.day_6 = 0;
		}else {
			this.day_6 = 1;
		}
		if(day_7 == null) {
			this.day_7 = 0;
		}else {
			this.day_7 = 1;
		}
		this.where_to_go = where_to_go;
		this.remarks = remarks;
		this.holiday_name = holiday_name;
	}
	@Override
	public String toString() {
		return "Holiday [id=" + id + ", user_id=" + user_id + ", day_0=" + day_0 + ", day_1=" + day_1 + ", day_2="
				+ day_2 + ", day_3=" + day_3 + ", day_4=" + day_4 + ", day_5=" + day_5 + ", day_6=" + day_6 + ", day_7="
				+ day_7 + ", where_to_go=" + where_to_go + ", remarks=" + remarks + ", holiday_name=" + holiday_name
				+ "]";
	}
}