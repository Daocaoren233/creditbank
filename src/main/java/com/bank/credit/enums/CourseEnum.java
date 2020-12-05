package com.bank.credit.enums;

import lombok.Getter;

@Getter
public enum CourseEnum implements CodeEnum{
    UP(0,"学生可见的"),
    DOWN(1,"学生不可见的"),
    ;

    private Integer code;
    private String message;

    CourseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
