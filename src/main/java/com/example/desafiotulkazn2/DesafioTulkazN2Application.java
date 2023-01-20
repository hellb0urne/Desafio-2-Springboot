package com.example.desafiotulkazn2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioTulkazN2Application {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTulkazN2Application.class, args);
	}

}
