package com.buildtools.introduction;

import com.buildtools.introduction.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IntroductionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IntroductionApplication.class, args);
		GreetingService service = (GreetingService)ctx.getBean(GreetingService.class);

		System.out.println(service.greet());
	}
}
