package com.tgy.hutoolcaptcha.pojo;

import lombok.Data;

/**
 * @author tgy
 * @date 2023/1/30 16:19
 */
@Data
public class User {
	private Long id;
	private String name;
	private String password;
	private String email;
	private Integer age;


}
