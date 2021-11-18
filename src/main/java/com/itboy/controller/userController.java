package com.itboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itboy.exception.sysException;
/**
 * @author wh
 * @date 2021年11月16日10:27
 */
@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping("testException")
    public String testException() throws sysException{
        System.out.println("textException执行了");
        //模拟异常
        try {
            int a=10/0;
        } catch (Exception e) {
            e.printStackTrace();
           throw  new sysException("用户查询异常");
        }
        return "success";
    }
}
