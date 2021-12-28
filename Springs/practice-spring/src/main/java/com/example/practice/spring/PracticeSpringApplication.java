
package com.example.practice.spring;

/*import com.example.practice.spring.controller.PracticeController;
import com.example.practice.spring.services.PracticeServices;*/


import com.example.practice.spring.services.PracticeServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringApplication.class, args);

		PracticeServices p = new PracticeServices();
		p.addNames("Rahul","Kudala");
	}

}
