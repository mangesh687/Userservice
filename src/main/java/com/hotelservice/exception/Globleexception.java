package com.hotelservice.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globleexception {
	
	@ExceptionHandler
	public ResponseEntity<Map<String, Object>> notFoundHandler(ResourcenotFoundException ex){
		Map map=new HashMap<>();
		map.put("massage", ex.getMessage());
		map.put("satus", false);
		map.put("satus", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}

}
