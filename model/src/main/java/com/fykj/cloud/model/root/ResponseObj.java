package com.fykj.cloud.model.root;


import io.swagger.annotations.ApiModel;

import java.io.Serializable;


@ApiModel(value = "服务端响应基础类")
public class ResponseObj<T>  implements Serializable {

    public static final  int  SUCCESS_CODE=200;

    public static final String SUCCESS_MSG="SUCCESS";

    private int  code;

    private T data;

    private String message;

    public int getCode() {
        return code;
    }

    public ResponseObj setCode(int code) {
        this.code = code;
        return  this;
    }


    public T getData() {
        return data;
    }

    public ResponseObj setData(T data) {
        this.data = data;
        return  this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseObj setMessage(String message) {
        this.message = message;
        return  this;
    }

    public static <T>ResponseObj<T>  createResponse(int code,String msg){
        return   new ResponseObj<T>() .setCode(code).setMessage(msg);
    }

    public static <T> ResponseObj<T> createSuccessResponse(T obj){
        return  createResponse(SUCCESS_CODE,SUCCESS_MSG).setData(obj);
    }

    public static <T>   ResponseObj<T> createSuccessResponse(){
        return  createResponse(SUCCESS_CODE,SUCCESS_MSG);
    }

    public static ResponseObj createErrResponse(ErrerMsg errerMsg){
        return createResponse(errerMsg.getCode(),errerMsg.getMessage());
    }


    @Override
    public String toString() {
        return "{status=" + code +
                ", data=" + data +
                ", msg='" + message + '\''+"}";
    }
}
