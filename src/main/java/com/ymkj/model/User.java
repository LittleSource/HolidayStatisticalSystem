package com.ymkj.model;
/**
 * 用户Model
 * @author yuanGe
 *
 */
public class User {
	private Integer user_id;
	private String name;
	private String xi;
	private String class_;
	private String bed_no;
	private String phone;

	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getXi() {
		return xi;
	}
	public void setXi(String xi) {
		this.xi = xi;
	}
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getBed_no() {
		return bed_no;
	}
	public void setBed_no(String bed_no) {
		this.bed_no = bed_no;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(Integer user_id, String name, String xi, String class_, String bed_no, String phone) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.xi = xi;
		this.class_ = class_;
		this.bed_no = bed_no;
		this.phone = phone;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", xi=" + xi + ", class_=" + class_ + ", bed_no=" + bed_no
				+ ", phone=" + phone + "]";
	}
}
