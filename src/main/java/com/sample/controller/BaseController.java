/**
 * 
 */
package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author user
 *
 */
@RestController
public class BaseController {

	@RequestMapping("/healthcheck")
	public String healthCheck() {
		return "OK";
	}

	@GetMapping("/welcome")
	public String Welcome(@RequestParam(value = "name", defaultValue = "Parthi") String name) {
		return "Welcome " + name;
	}
}
