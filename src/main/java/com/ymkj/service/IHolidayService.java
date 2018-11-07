package com.ymkj.service;

import com.ymkj.model.Holiday;

public interface IHolidayService extends IService<Holiday>{
	//保存假期
	int save(Holiday holiday);
}