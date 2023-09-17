package com.khadri.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

	@GetMapping("/wish")
	public String getWishMessage(Integer hour) {

		if (hour > 6 && hour <= 12) {
			return "Good Morning";
		} else if (hour > 12 && hour <= 18) {
			return "Good Afternoon";
		} else {
			return "Good Night";
		}

	}

	@PostMapping("/message")
	public String postWishMessage(String msg) {

		if (msg.equals("hai")) {
			return "hello";
		} else {
			return "bye";
		}

	}

	@PutMapping("/message")
	public String putWishMessage(String msg) {

		return msg + "modified";

	}

}
