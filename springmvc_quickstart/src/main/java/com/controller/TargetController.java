package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangxin
 * @title
 * @Package com.controller
 * @date 8/15/21 10:13 下午
 */
@Controller
public class TargetController {

    @RequestMapping("/targetMethod")
    public String targetMethod() {
        System.out.println("目标方法执行...");
        return "success";
    }
}
