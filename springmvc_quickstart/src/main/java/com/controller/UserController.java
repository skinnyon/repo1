package com.controller;

import com.domain.QueryVo;
import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zhangxin
 * @title
 * @Package com.controller
 * @date 8/12/21 9:53 下午
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("username") // 向request域（model）中存入key为username时，会同步到session域中
public class UserController {


     @RequestMapping("/quick")
     public String quick(String id, String username) {
         System.out.println(id);
         System.out.println(username);
         System.out.println("1111");

         // 视图跳转
         return "b";
     }
    @RequestMapping(path = "/quick2", method = RequestMethod.GET, params = {"accountName"})
    public String quick2() {
        System.out.println("1111");

        // 视图跳转
        return "a";
    }
    @RequestMapping("/quick3")
    public String quick3() {
        System.out.println("1111");
        // 视图跳转
        return "index";
    }


    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        System.out.println(user);
        // 视图跳转
        return "#";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(int[] ids) {
        System.out.println(Arrays.toString(ids));
        // 视图跳转
        return "#";
    }

    @RequestMapping("/queryVo")
    public String queryVo(QueryVo queryVo) {
        System.out.println(queryVo);
        // 视图跳转
        return "#";
    }

    /*
        @RequestParam:
            name:匹配参数的名字
            defaultValue:设置参数的默认值
            required:设置是否必须传递该参数，默认为true

     */
    @RequestMapping("/findByPage")
    public String findByPage(@RequestParam(name = "pageNo", defaultValue = "1", required = false) Integer pageNum,
                             @RequestParam(defaultValue = "5")Integer pageSize) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        return "#";
    }

    @RequestMapping("/cookie")
    public String header(@RequestHeader("cookie") String cookie) {
        System.out.println(cookie);
        return "";
    }

    @RequestMapping("cookieValue")
    public void cookieValue(@CookieValue("JSESSIONID") String jsessionId) {
        System.out.println(jsessionId);
    }

    @RequestMapping("/servletApi")
    public void servletApi(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(httpSession);
    }

    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 1.通过response直接响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("hello");
        request.setAttribute("username", "Word");

        // 2.通过request实现转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        // 3.通过response实现重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

    @RequestMapping("/forward")
    public String forward(Model model) {
        model.addAttribute("username", "nihao");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/redirect")
    public String redirect(Model model) {
        model.addAttribute("username", "hello");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/modelAndView")
    public String modelAndView(Model model) {
        model.addAttribute("username", "hello");
        return "redirect:/index.jsp";
    }


    @RequestMapping("/returnModelAndView")
    public ModelAndView returnModelAndView() {
        // model: 存放数据
        // view：展示数据
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("name", "value");
        // 设置视图名称，视图解析器解析mmodelAndView，拼接前缀后缀
        modelAndView.setViewName("success");

        return modelAndView;
    }

    @RequestMapping("/returnModelAndView2")
    public ModelAndView returnModelAndView2(ModelAndView modelAndView) {
        //设置模型数据
        modelAndView.addObject("username", "itheima");
        //设置视图名称
        modelAndView.setViewName("success"); return modelAndView;
    }

    // ajax异步交互
    @RequestMapping("/ajaxRequest")
    @ResponseBody()
    public List<User> ajaxRequest(@RequestBody List<User> userList) {
        System.out.println(userList);
        return userList;
    }




}

