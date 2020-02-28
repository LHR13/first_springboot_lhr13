package com.lhr13.first_springboot_lhr13.Handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView uploadException(MaxUploadSizeExceededException e,
                                HttpServletResponse request) throws IOException {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","上传文件超出大小限制");
        mv.setViewName("error");
        return mv;
    }
}
