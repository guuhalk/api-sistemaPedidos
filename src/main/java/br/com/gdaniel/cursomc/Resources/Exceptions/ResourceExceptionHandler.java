package br.com.gdaniel.cursomc.Resources.Exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import br.com.gdaniel.cursomc.Services.Exceptions.ExceptionsObjectNotFound;

@ControllerAdvice
public class ResourceExceptionHandler {

	public ResponseEntity<StandardError> objectNotFound (ExceptionsObjectNotFound e, HttpServletRequest request ){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
}
