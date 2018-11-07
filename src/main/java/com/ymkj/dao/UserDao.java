package com.ymkj.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ymkj.model.User;

public interface UserDao extends IBaseDao<User>{

	@Select("SELECT * From ymkj_student where name = #{name}")
	User findByName(@Param("name") String name) ;
	
	@Insert("insert into ymkj_student (name, xi, class_, bed_no, phone) Values (#{name}, #{xi}, #{class_}, #{bed_no}, #{phone})")
	int save(@Param("name") String name,@Param("xi") String xi,@Param("class_") String class_,@Param("bed_no") String bed_no,@Param("phone") String phone);

}