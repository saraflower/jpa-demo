package com.saraflower.jpademo;

import com.saraflower.jpademo.config.EnvReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		EnvReader.readEnvironment();
		SpringApplication.run(JpaDemoApplication.class, args);
	}

}
