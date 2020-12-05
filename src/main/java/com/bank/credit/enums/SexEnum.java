package com.bank.credit.enums;

import lombok.Getter;

@Getter
public enum SexEnum implements CodeEnum{
    MAN(0,"男"),
    FEMAN(1,"女"),
    ;

    private Integer code;
    private String message;

    SexEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
