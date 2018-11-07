package com.ymkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.model.Holiday;
import com.ymkj.pojo.UserFrom;
import com.ymkj.service.IHolidayService;
import com.ymkj.service.IUserService;
import com.ymkj.util.GetSMS;

@Controller
public class IndexController {

	private final IUserService userService;
	private final IHolidayService holidayService;
	
    @Autowired
    public IndexController(IUserService userService, IHolidayService holidayService) {
        this.userService = userService;
        this.holidayService = holidayService;
    }
    
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    /**
     * 发送验证码
     * @param phone
     * @return
     */
	@RequestMapping(value = "/sms", method = RequestMethod.POST)
	@ResponseBody
    public String sendSMS(@RequestParam String phone){ 
       GetSMS.getmMssage(phone);
       return GetSMS.randNum;
    }
    
    
	/**
	 * 获取from表单给UserForm对象
	 * @return
	 */
	@RequestMapping(value="/accept",method=RequestMethod.POST)
	public String accept(UserFrom userFrom){
		//储存学生信息
		if(!userService.findByName(userFrom.getUser().getName())) {	//判断学生信息是否在数据库中
			userService.save(userFrom.getUser());
		}
		Integer user_id = userService.getUserByName(userFrom.getUser().getName()).getUser_id();
		//储存假期信息
		Holiday holiday = userFrom.getHoliday();
		holiday.setUser_id(user_id);
		holidayService.save(holiday);
		return "success";
	}
}
