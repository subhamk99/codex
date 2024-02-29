package com.codex.lab.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.python.core.PySyntaxError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import static com.codex.lab.util.constants.ApplicationConstants.INVALID_PYTHON_SYNTAX;

@RestControllerAdvice
@Slf4j
public class PythonExceptionHandler {
	@ExceptionHandler(PySyntaxError.class)
	public ResponseEntity<Map<String, String>> handleKafkaException(PySyntaxError error) {

		log.error(String.format("%s :: %s",INVALID_PYTHON_SYNTAX, error.getMessage()));

		Map<String, String> responseBody = new HashMap<>();
		responseBody.put("messsage", error.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
	}
}
