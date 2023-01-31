package com.tgy.hutoolcaptcha.controller;

import com.tgy.hutoolcaptcha.pojo.User;
import com.tgy.hutoolcaptcha.service.AdminService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tgy
 * @date 2023/1/30 16:13
 */
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/loginc")
	public String loginByHutool(@RequestParam("verifyCode") String verifyCode,
			HttpSession session, User user) {
		String captchaCode = session.getAttribute("verifyCode") + "";
		User admin = adminService.selectUser(user);
		if (verifyCode.equals(captchaCode)) {
			if(admin!=null){
				return "success";
			}else {
				return "error";
			}

		}
		return "false";
	}
}


