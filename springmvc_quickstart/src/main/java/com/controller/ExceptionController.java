package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangxin
 * @title
 * @Package com.controller
 * @date 8/15/21 6:02 下午
 */
@Controller
public class ExceptionController {


    @RequestMapping("/testException")
    public String testException() {
        int i = 1/0;
        return "success";
    }

}
