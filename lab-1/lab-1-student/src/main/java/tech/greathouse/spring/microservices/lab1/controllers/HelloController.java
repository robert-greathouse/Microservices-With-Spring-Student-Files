/**
 * 
 */
package tech.greathouse.spring.microservices.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cyotee
 *
 */
@Controller
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "hello";
	}
}
