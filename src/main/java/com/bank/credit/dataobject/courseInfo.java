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

    /**课程视频的路径*/
    private String courseVideo;

    /**课程图片的路径*/
    private String courseIcon;

    /**课程老师的ID*/
    private String teacherId;

    /**课程类型，如1为数学*/
    private Integer courseType;

    /** 0为可看的、 1为不可看的 */
    private Integer courseStatus = CourseEnum.UP.getCode();

    /**课程的学分*/
    private BigDecimal courseCredit;

    /**课程的描述*/
    private String courseDescription;

    /**课程总时长*/
    private BigDecimal courseTime;

    /**课程开始时间*/
    private String courseStarTime;
}
