package com.i.park.controller;

import com.github.pagehelper.PageHelper;
import com.i.park.bean.Result;
import com.i.park.bean.User;
import com.i.park.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
 
/**
 * @author Think-pc
 *	
 * @RestController   返回json数据     添加这个后   不能返回页面
 * 
 * @Controller        标注这是一个servlet
 * 
 * @RequestMapping   映射
 *
 * @ResponseBody     如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	 
	
	
	/**
	 * 查询所有
	 * 
	 * @return 对象列表
	 */
	@RequestMapping("getAll1")
	public Result<List<User>> getAll1() {

		
		 
		Result<List<User>> result= new Result<List<User>>();
		List<User> users = userService.getAll();
		
		if (users.size() == 0) {
			result.msg = "没有数据";
			result.code = 500;
		} else {
			result.msg = "查询成功";
			result.code = 200;
			result.data = users;
		}

		return result;
	}
	  
	
	/**
	 * 查询所有
	 * 
	 * @return 对象列表
	 */
	@RequestMapping("getAll")
	public Result<List<User>> getAll(int page,int num) {

		
		PageHelper.startPage(page, num);
		Result<List<User>> result= new Result<List<User>>();
		List<User> users = userService.getAll();
		
		if (users.size() == 0) {
			result.msg = "没有数据";
			result.code = 500;
		} else {
			result.msg = "查询成功";
			result.code = 200;
			result.data = users;
		}

		return result;

	}




    @ResponseBody
    @RequestMapping("usersave")
    public Map<String,String> saveUser( User user){

	/*    System.out.print("user == "+user.toString());



        Map<String,String> map = new HashMap<String,String>();
        map.put("res", "1");
        if(userService.addUser(user)) {
            map.put("res", "0");
        }
        return map;*/

        System.out.print(user +"\n");

	return null;
    }






	/**
	 * 根据ID查询
	 * 
	 * @param id
	 *            参数
	 * @return User对象
	 */
	@RequestMapping("getById")
	public Result<User> getById(long id) {

		
		System.out.println("id  = "+id);
		
		
		Result<User> result;

		if (userService.getById(id) == null) {
			result = new Result<User>();
			result.msg = "没有数据";
			result.code = 404;
		} else {
			result = new Result<User>();
			result.msg = "查询成功";
			result.code = 200;
			result.data = userService.getById(id);
		}

		return result;

	}

	/**
	 * 修改VipName
	 * 
	 * @param id
	 *            参数
	 * @return User对象
	 */
	@GetMapping("/updateVipName")
	public Result<User> updateVipName(String name,long id) {

		User user = new User(name,(int)id);
		
		Result<User> result;

		if (userService.updateVipName(user) == 1) {
			result = new Result<User>();
			result.msg = "成功";
			result.code = 200;
			result.data =userService.getBodyById(id);
		} else {
			result = new Result<User>();
			result.msg = "失败";
			result.code = 500;
			 
		}

		return result;
		

	}

}
