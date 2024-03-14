package com.mainms.global.logging;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@Log4j2
public class LoggingFilter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logRequestDetails(request);
        return true;
    }

    private void logRequestDetails(HttpServletRequest request) {
        log.info("Request received: {} {} from {}", request.getMethod(), request.getRequestURI(), request.getRemoteAddr());
    }
}
