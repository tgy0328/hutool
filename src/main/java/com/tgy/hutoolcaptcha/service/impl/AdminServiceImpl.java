package com.tgy.hutoolcaptcha.service.impl;

import com.tgy.hutoolcaptcha.mapper.AdminMapper;
import com.tgy.hutoolcaptcha.pojo.User;
import com.tgy.hutoolcaptcha.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tgy
 * @date 2023/1/30 16:28
 */
@Service
public class AdminServiceImpl implements AdminService {
  @Autowired
	private AdminMapper adminMapper;

	@Override
	public User selectUser(User user) {
		return adminMapper.selectUser(user);
	}
}
