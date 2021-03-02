package com.huyl.pagehelper.responce;

import lombok.Data;

@Data
public class WebResponce<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> WebResponce success(T data) {
        WebResponce webResponce = new WebResponce();
        webResponce.setCode(0);
        webResponce.setMsg("成功");
        webResponce.setData(data);
        return webResponce;
    }

    public static <T> WebResponce error(T data, String msg) {
        WebResponce webResponce = new WebResponce();
        webResponce.setCode(-1);
        webResponce.setMsg(msg);
        webResponce.setData(data);
        return webResponce;
    }
}
