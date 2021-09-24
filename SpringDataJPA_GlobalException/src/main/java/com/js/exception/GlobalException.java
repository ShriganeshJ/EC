package com.js.exception;

import java.time.LocalDateTime;

import org.hibernate.type.LocalDateType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(RecordNotFoundExcepiton.class)
	public ResponseEntity<Object> sendServiceResponse(RecordNotFoundExcepiton ex) {
		ResponseEntity<Object> entity;

		//ExceptionResponse respons = new ExceptionResponse();
		//respons.setDateTime(LocalDateTime.now());
      //  respons.setMessage("Not Found");
		entity = new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

		return entity;
	}

}
