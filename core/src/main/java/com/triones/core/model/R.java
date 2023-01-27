package com.triones.core.model;

import com.alibaba.fastjson2.JSONObject;

public class R extends JSONObject {

    private static final String CODE = "code";
    private static final String EXPLANATION = "explanation";
    private static final String DATA = "data";
    private static final String MESSAGE = "message";

    public R() {
    }

    public R(int code,String massage,String explanation) {
        super.put(CODE,code);
        super.put(MESSAGE,massage);
        super.put(EXPLANATION,explanation);
    }

    public static R ok(){
        R result = new R();
        result.put(CODE, ResponseEnum.OK.getCode());
        result.put(MESSAGE,ResponseEnum.OK.getMessage());
        result.put(EXPLANATION,ResponseEnum.OK.getExplanation());
        return result;
    }

    public static R ok(int code,String massage,String explanation) {
        R result = new R();
        result.put(CODE,code);
        result.put(MESSAGE,massage);
        result.put(EXPLANATION,explanation);
        return result;
    }

    public static R fail() {
        R result = new R();
        result.put(CODE, ResponseEnum.ERROR.getCode());
        result.put(MESSAGE,ResponseEnum.ERROR.getMessage());
        result.put(EXPLANATION,ResponseEnum.ERROR.getExplanation());
        return result;
    }

    public static R fail(int code,String massage,String explanation) {
        R result = new R();
        result.put(CODE,code);
        result.put(MESSAGE,massage);
        result.put(EXPLANATION,explanation);
        return result;
    }

    public R(ResponseEnum responseEnum) {
        if (responseEnum != null) {
            super.put(CODE, responseEnum.getCode());
            super.put(MESSAGE, responseEnum.getMessage());
            super.put(EXPLANATION, responseEnum.getExplanation());
        }
    }

    public static R ok(ResponseEnum responseEnum) {
        R result = new R();
        if (responseEnum != null) {
            result.put(CODE, responseEnum.getCode());
            result.put(MESSAGE, responseEnum.getMessage());
            result.put(EXPLANATION, responseEnum.getExplanation());
        }
        return result;
    }

    public static R fail(ResponseEnum responseEnum){
        R result = new R();
        if (responseEnum!=null){
            result.put(CODE,responseEnum.getCode());
            result.put(MESSAGE,responseEnum.getMessage());
            result.put(EXPLANATION,responseEnum.getExplanation());
        }
        return result;
    }

    public <T> R setData(T data){
        super.put(DATA,data);
        return this;
    }

}
