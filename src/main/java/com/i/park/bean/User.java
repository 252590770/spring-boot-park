package com.i.park.bean;

import java.io.Serializable;

/**
 * @version 1.0 @2018-5-7 14:40:37
 *
 *          用户模块
 */

public class User implements Serializable {

	public static final long serialVersionUID = 1L;
	public Integer id;
	public long phone;
	public String vip_name;
	public String name;
	public String vip_tel;
	public String vip_img;
	public String vip_pass;
	public Integer vip_history;
	public Integer vip_attention;
	public Integer vip_manager;
	public Integer vip_buy;
	public Integer vip_fans;
	public double vip_income;


	public User( ) {
	}
	
	public User(String vip_name,String vip_pass) {
		
		this.vip_name = vip_name;
		this.vip_pass = vip_pass;
		
	}
	
	
	public User(String name,int id) {
		
		this.name = name;
		this.id = id;
		
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", vip_name=" + vip_name + ", vip_tel=" + vip_tel + ", vip_img=" + vip_img
				+ ", vip_pass=" + vip_pass + ", vip_history=" + vip_history + ", vip_attention=" + vip_attention
				+ ", vip_manager=" + vip_manager + ", vip_buy=" + vip_buy + ", vip_fans=" + vip_fans + ", vip_income="
				+ vip_income + "]";
	}

}
