package com.tgy.hutoolcaptcha.mapper;

import com.tgy.hutoolcaptcha.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @author tgy
 * @date 2023/1/30 16:29
 */
@Mapper
public interface AdminMapper {


	@Select("select * from user where name=#{name} and password=#{password}")
	User selectUser(User user);
}
