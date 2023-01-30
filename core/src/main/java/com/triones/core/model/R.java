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

class Solution {

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));
        System.out.println(countAndSay(8));
        System.out.println(countAndSay(9));
    }

    public static String countAndSay(int n) {
        long num = 1;
        for (int i = 1; i < n; i++) {
            long temp = 1, modl = num % 10, cnt = 0, tempNum = 0;
            while(num > 0) {
                long mod = num % 10; num /= 10;
                if (modl != mod) {
                    tempNum += temp * modl; temp *= 10;
                    tempNum += cnt * temp; temp *= 10; cnt = 0; modl = mod;
                }
                cnt++;
            }
            tempNum += (temp * modl); temp *= 10; tempNum += (cnt * temp);
            num = tempNum;
        }
        return Long.valueOf(num).toString();
    }
}
