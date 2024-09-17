package com.jione.SpringPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//public class Faculty implements college{
//	public void disp() {
//		
//	}
//}
@Configuration
public class Faculty{
	@Bean
	public Student getstudent() {
		return new Student();
	}
}