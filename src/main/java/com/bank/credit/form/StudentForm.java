package com.bank.credit.form;

import com.bank.credit.enums.SexEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudentForm {
    private String studentId;

    private String studentName;

    private String passWord;

    /**0为男生*/
    private Integer sex = SexEnum.MAN.getCode();

    private String studentPhone;

    /**学生专业*/
    private String studentMajor;

}
