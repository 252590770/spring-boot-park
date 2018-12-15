package com.i.park.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.i.park.bean.User;

 


@Mapper
public interface LoginMapper {
	
	@Select("select * from tb_user where vip_name = #{vip_name} and vip_pass = #{vip_pass} ")
	public List<User> login(User user);
	
}
