package sample.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //spring boot, auto config, and external variables (use @Value)
public class SampleService {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleService.class, args);
	}

}
