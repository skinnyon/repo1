package com.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangxin
 * @title
 * @Package com.exception
 * @date 8/15/21 5:55 下午
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    // Exception: 实际抛出的异常
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        // 具体的异常处理 产生异常后跳转到具体的一个页面
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
