package com.lhr13.first_springboot_lhr13.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e,
                                HttpResponse request) throws IOException {

    }
}
