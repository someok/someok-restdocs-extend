package com.someok.restdocs.payload;

/**
 * 错误信息结构。
 *
 * @author wjx
 * @version 1.0.0
 */
public class ErrorDescriptor {
    private String code;

    private String message;

    public ErrorDescriptor(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ErrorDescriptor() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
