package tech.tfrabaioli.workshopmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tech.tfrabaioli.workshopmongo.services.exception.ObjectNotFoundException;

@ControllerAdvice 
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError("Não encontrado", e.getMessage(), request.getRequestURI(), System.currentTimeMillis(), status.value());
	    return ResponseEntity.status(status).body(err);
	}

}
