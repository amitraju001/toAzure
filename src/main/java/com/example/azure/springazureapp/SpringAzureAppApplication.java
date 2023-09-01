package com.example.azure.springazureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringAzureAppApplication {
@GetMapping("greeting")
public String Greeting(){
	return "Greeting from another Azure AppService";
}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureAppApplication.class, args);
	}

}
