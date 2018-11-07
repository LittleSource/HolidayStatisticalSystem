package com.ymkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymkj.dao.UserDao;
import com.ymkj.model.User;

@Service("userService")//别名
public class UserService implements IUserService{
	//@Autowired 必须加 不然报错空指针
	@Autowired
	private UserDao userDao;
	/**
	 * 保存学生
	 */
	public int save(User user) {
		return userDao.save(user.getName(), user.getXi(), user.getClass_(), user.getBed_no(), user.getPhone());	
	}
	/**
	 * 根据姓名判断是否有值
	 */
	public boolean findByName(String name) {
		User user= userDao.findByName(name);
		if(user!=null) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 根据姓名查询对象
	 */
	public User getUserByName(String name) {
		return userDao.findByName(name);
	}
}
