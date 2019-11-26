/**
 * 
 */
package com.sample.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

/**
 * @author user
 *
 */
@RestController
@Log4j2
public class BaseController {

	private static final String DATE_FORMAT = "MMM d, yyyy HH:mm a";

	@RequestMapping("/")
	public @ResponseBody String main() {
		log.info("Main function initialization...");
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		String formattedDate = dateFormat.format(date);
		return "Service is up and running: " + formattedDate;
	}

	@RequestMapping("/healthcheck")
	public String healthCheck() {
		return "OK";
	}

	@GetMapping("/welcome")
	public String Welcome(@RequestParam(value = "name", defaultValue = "Parthi") String name) {
		return "Welcome " + name;
	}
}
