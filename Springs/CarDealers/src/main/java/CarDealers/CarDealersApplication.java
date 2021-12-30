package CarDealers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarDealersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDealersApplication.class, args);

		System.out.println("Tomcat Port 8080 Started!");
	}

}
