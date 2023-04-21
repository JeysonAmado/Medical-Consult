package com.jeyson.makeMedicalConsultation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jeyson.makeMedicalConsultation")
public class MakeMedicalConsultationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeMedicalConsultationApplication.class, args);
	}

}
