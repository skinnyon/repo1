package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangxin
 * @title
 * @Package com.controller
 * @date 8/15/21 2:31 下午
 */
@RestController // 组合注解 @Controller + @ResponseBody
// @Controller
@RequestMapping("/restful")
public class RestfulController {


    @PostMapping("/user") // @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String post() {
        return "post";
    }
    /*
        根据id查询:get请求
        http://localhost:8080/项目名/restful/user/2
     */
    // @GetMapping("/user/{id}")    // 等价于@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    // @ResponseBody //使用注解将返回的字符串转换为JSON，否则会被视图解析器解析进行查找视图
    public String findById(@PathVariable int id) { // PathVariable 获取restful风格URL中占位符的值
        return "findById" + id;
    }

    @PutMapping("/user")
    public String put() {
        return "put";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id) {
        return "delete" + id;
    }
}
