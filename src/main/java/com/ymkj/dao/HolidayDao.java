package com.ymkj.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.ymkj.model.Holiday;

public interface HolidayDao extends IBaseDao<Holiday>{
	@Insert("insert into ymkj_holiday (user_id,day_0, day_1, day_2, day_3, day_4, day_5, day_6, day_7,where_to_go, remarks, holiday_name) Values "
			+ "(#{user_id}, #{day_0}, #{day_1}, #{day_2}, #{day_3}, #{day_4}, #{day_5}, #{day_6}, #{day_7},#{where_to_go}, #{remarks}, #{holiday_name})")
	int save(@Param("user_id") Integer user_id,@Param("day_0") Integer day_0,@Param("day_1") Integer day_1,@Param("day_2") Integer day_2,@Param("day_3") Integer day_3,@Param("day_4") Integer day_4,
			@Param("day_5") Integer day_5,@Param("day_6") Integer day_6,@Param("day_7") Integer day_7,@Param("where_to_go") String where_to_go
			,@Param("remarks") String remarks,@Param("holiday_name") String holiday_name);
}