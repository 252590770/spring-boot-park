package com.i.park.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.i.park.bean.User;


@Mapper
public interface UserMapper {


    //添加信息
    @Insert("insert into tb_user(vip_name,vip_tel,vip_pass) values(#{vip_name},#{vip_tel},#{vip_pass},SYSDATE())")
    public void insert(User user);

	@Select("select * from tb_user")
	public List<User> getAll();
	
	
	@Select("select *from tb_user where id = #{id}")
	public User getById(long id);
	
	@Select("select name from tb_user where id = #{id}")
	public String getNameById(long id);
	
	
	@Select("select *    from tb_user where id = #{id}")
	public User getBodyById(long id);
	
	
	@Update("Update tb_user Set  name = #{name} where  id =#{id}")
	public int updateVipName(User user);
//	public String updateVipName(String vip_name,String id);
//	public String updateVipName(@Param(values = "vip_name")String vip_name,@Param(value = "id")String id);
	
	//@Param(value = "userType")String type, 
	
	
	
	

}
