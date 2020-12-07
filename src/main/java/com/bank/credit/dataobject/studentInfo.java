package com.bank.credit.dataobject;

import com.bank.credit.enums.SexEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class studentInfo {
    @Id
    private String studentId;

    private String studentName;

    private String passWord;

    /**0为男生*/
    private Integer sex = SexEnum.MAN.getCode();

    private String studentPhone;

    /**学生专业*/
    private String studentMajor;

    /**学生累计学分*/
    private BigDecimal studentCredit = new BigDecimal(0);

    /**学生累计学习时长*/
    private BigDecimal studentTime = new BigDecimal(0);

    /**学生诚信值*/
    private BigDecimal studentHonesty = new BigDecimal(100);

    /**学生申请学分值*/
    private BigDecimal studentNeedCredit = new BigDecimal(0);

}
