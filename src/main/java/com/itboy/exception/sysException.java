package com.itboy.exception;

/**
 * 自定义异常类
 * @author wh
 * @date 2021年11月16日10:47
 */
public class sysException extends Exception {
    private String message;

    public sysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
