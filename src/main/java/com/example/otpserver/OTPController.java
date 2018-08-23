package com.example.otpserver;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OTPController {
	
	@GetMapping("/otp/{userId}")
	public ResponseEntity<String> genOtp(){
		final Random random = new Random();
		final String otp = random.nextInt(9)+""+random.nextInt(9)+""+random.nextInt(9)+""+random.nextInt(9);
		return new ResponseEntity<>(otp, HttpStatus.OK);
	}
	
}
