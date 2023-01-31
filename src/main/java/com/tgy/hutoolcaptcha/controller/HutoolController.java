package com.tgy.hutoolcaptcha.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tgy
 * @date 2023/1/30 16:12
 */
@RestController
public class HutoolController {

	@GetMapping("/common/verify")
	public void Verify(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//定义图形验证码的长、宽、验证码字符数、干扰线宽度
		ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(150, 40, 5, 4);
		//图形验证码写出，可以写出到文件，也可以写出到流
		captcha.write(response.getOutputStream());
		//获取验证码中的文字内容
		String verifyCode = captcha.getCode();
		request.getSession().setAttribute("verifyCode", verifyCode);
	}
}

