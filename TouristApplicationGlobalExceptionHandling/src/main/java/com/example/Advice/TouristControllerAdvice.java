package com.example.Advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails>HandleTouristNotFoundException(TouristNotFoundException t){
		ErrorDetails error=new ErrorDetails("Tourist id is not found", t.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<ErrorDetails>HandleAnyOtherException(Exception e){
		ErrorDetails error=new ErrorDetails("Internal error", e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
//	@ExceptionHandler(TouristNotFoundException.class)
//	public ErrorDetails HandleTouristNotFoundException(TouristNotFoundException t){
//		return new ErrorDetails("Tourist id is not found", t.getMessage(), LocalDateTime.now());
//		
//	}
//	
//	public ErrorDetails HandleAnyOtherException(Exception e){
//		 return new ErrorDetails("Internal error", e.getMessage(), LocalDateTime.now());
//		
//	}
	
}
