package com.mainms.global.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex, WebRequest req) {
        HashMap<String, Object> returnMap = new HashMap<>();
        var defaultErrorMessage = "Validation error!";
        if (ex.getErrorCount() > 0) {
            List<String> errorDetails = new ArrayList<>();
            for (ObjectError error : ex.getBindingResult().getAllErrors()) {
                errorDetails.add(error.getDefaultMessage());
            }

            if (!errorDetails.isEmpty()) {
                defaultErrorMessage = errorDetails.get(0);
            }
        }
        returnMap.put("timestamp", new Date());
        returnMap.put("status", 400);
        returnMap.put("message", defaultErrorMessage);
        var path = req.getDescription(false);
        if (path.startsWith("uri=")) {
            path = path.substring(4);
        }
        returnMap.put("path", path);
        return ResponseEntity.badRequest().body(returnMap);
    }
}

