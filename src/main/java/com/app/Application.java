package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//HIS-100
@SpringBootApplication
public class Application {
    private static int i=10;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
