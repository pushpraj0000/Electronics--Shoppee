//package com.example.demo.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class CustomExceptionHandler {
//	
//	@ExceptionHandler(CustomerNotFoundException.class)
//	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException cnfe){
//		return new ResponseEntity<String>(cnfe.getMessage(),HttpStatus.NOT_FOUND);
//	}
//}
