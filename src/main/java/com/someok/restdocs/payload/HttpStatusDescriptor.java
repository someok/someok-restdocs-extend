package com.someok.restdocs.payload;

/**
 * @author wjx
 * @version 1.0.0
 */
public class HttpStatusDescriptor {
    private String code;

    private String message;

    public HttpStatusDescriptor() {
    }

    public HttpStatusDescriptor(String code, String message) {
        this.code = code;
        this.message = message;
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
