package com.ymkj.pojo;

import com.ymkj.model.Holiday;
import com.ymkj.model.User;

public class UserFrom {
	private User user;
	private Holiday holiday;
	public User getUser() {
		return user;
	}
	public Holiday getHoliday() {
		return holiday;
	}
	public UserFrom(Integer day_0, Integer day_1, Integer day_2 , Integer day_3, Integer day_4, Integer day_5, Integer day_6, Integer day_7,
			String where_to_go, String remarks, String holiday_name, String name, String xi, String class_,
			String bed_no, String phone) {
		this.user = new User(null,name,  xi,  class_, bed_no, phone);
		this.holiday = new Holiday(null, null, day_0, day_1, day_2, day_3, day_4, day_5, day_6, day_7,where_to_go, remarks, holiday_name);
	}
}
