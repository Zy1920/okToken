package com.fykj.cloud.model.root;

import lombok.Getter;

/**
 *   错误返回定义
 */
@Getter
public enum ErrerMsg {
    //
    ERRER100(1,"Request exception"),

    ERRER420(420,"Parameter error"),

    ERRER600(600," Database update exception");


    private int code;
    private String message;

    ErrerMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
