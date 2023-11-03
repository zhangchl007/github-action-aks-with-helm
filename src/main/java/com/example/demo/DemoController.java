package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

//# count access website visit and error handling
@RestController
public class DemoController {
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public String Hello() {
		return "Hello World!";
	}

	@GetMapping("/count")
	public String count() {
		return "The website Visits Count: " + counter.incrementAndGet();
	}

}