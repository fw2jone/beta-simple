package com.triones.core.model;

/**
 * Systems use an extension enumeration value that inherits from the class (各系统使用可继承该顶级枚举进行扩展)
 * */
public enum ResponseEnum {

    /* 示例，不要使用http状态码作为响应码 */
    EXAMPLE(404,"example","示范响应码"),

    /* 请求成功 */
    /**
     * 请求成功
     * */
    OK(10000,"success","一切OK"),

    /**
     * 请求失败
     * */
    ERROR(20000,"error","服务器内部错误"),

    ;

    private final int code;
    private final String message;
    private final String explanation;

    ResponseEnum(int code, String message, String explanation) {
        this.code = code;
        this.message = message;
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
