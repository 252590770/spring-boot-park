package com.i.park.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i.park.bean.User;
import com.i.park.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
	
	 @Autowired
	 private UserMapper userMapper;


    //添加管理员
    @Transactional //添加事务
    public boolean addUser(User user) {
        try {
            userMapper.insert(user);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }



	 public List<User> getAll(){
		
		 return userMapper.getAll();
		 
	 }
	 
	 
	 public User getById(long id){
			
		 return userMapper.getById(id);
		 
	 }
	 
	 
	 public User getBodyById(long id){
		 
		 return userMapper.getBodyById(id);
		 
	 }
	 
	 
	 
	 
	 public int updateVipName(User user){
		 
		 return userMapper.updateVipName(user);
		 
	 }
	 
	 
	 

	
}
