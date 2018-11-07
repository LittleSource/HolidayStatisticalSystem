package com.ymkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymkj.dao.HolidayDao;
import com.ymkj.model.Holiday;
@Service("holidayService")//别名
public class HolidayService implements IHolidayService{
	@Autowired
	private HolidayDao holidayDao;
	@Override
	public int save(Holiday holiday) {
		return holidayDao.save(holiday.getUser_id(),holiday.getDay_0(),holiday.getDay_1(),holiday.getDay_2(),holiday.getDay_3(),holiday.getDay_4(),holiday.getDay_5(),holiday.getDay_6(),holiday.getDay_7(),
				holiday.getWhere_to_go(),holiday.getRemarks(),holiday.getHoliday_name());
	}
}