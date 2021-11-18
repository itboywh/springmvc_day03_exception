package com.itboy.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 * @author wh
 * @date 2021年11月16日10:49
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        sysException e = null;
        if (ex instanceof sysException) {
            e = (sysException) ex;
        } else {
            e = new sysException("系统正在维护中。。。。");
        }
            ModelAndView mv = new ModelAndView();
            //存入错误信息
            mv.addObject("errorMsg", e.getMessage());
            //调转错误页面
            mv.setViewName("error");
            return mv;
    }

}
