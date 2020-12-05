package com.bank.credit.dataobject;

import com.bank.credit.enums.CourseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class courseInfo {
    @Id
    private String courseId;

    private String courseName;

    private String courseVideo;

    private String courseIcon;

    private String teacherId;

    private Integer courseType;

    /** 0为可看的、 1为不可看的 */
    private Integer courseStatus = CourseEnum.UP.getCode();

    private BigDecimal courseCredit;

    private String courseDescription;

    private BigDecimal courseTime;

    private String courseStarTime;
}
