package in.yarraneella.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class Hello {
	@GetMapping
	String sayHi() {
		return "Hello Reddy";
	}
}
