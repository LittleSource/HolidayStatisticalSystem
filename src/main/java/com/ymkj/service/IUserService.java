package com.ymkj.service;

import com.ymkj.model.User;
public interface IUserService extends IService<User>{
	//保存学生
	int save(User user);
	/**
	 * 根据姓名判断是否有值
	 */
	boolean findByName(String name);
	/**
	 * 根据姓名查询对象
	 */
	User getUserByName(String name);
}