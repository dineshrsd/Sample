package com.dealer.exception;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalException extends Exception {

	@ExceptionHandler(value=NameNotFoundException.class)
	public ResponseEntity<Object> noname(NameNotFoundException mm){
		return new ResponseEntity<>(mm.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	
	
}
