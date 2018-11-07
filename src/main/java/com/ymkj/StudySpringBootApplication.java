package com.ymkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ymkj.dao")
public class StudySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringBootApplication.class, args);
	}
}
