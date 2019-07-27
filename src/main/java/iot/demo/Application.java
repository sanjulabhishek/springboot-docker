package iot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/rest")
	public String home() {
		return "Hello Docker ";
	}

	public static void main(String[] args) {
		System.out.println("Starting spring boot app");
		SpringApplication.run(Application.class, args);
		System.out.println(";das';dasd");
        System.out.println("test");
	}


}
