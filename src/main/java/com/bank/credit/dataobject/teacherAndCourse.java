package com.bank.credit.dataobject;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class teacherAndCourse {
    @Id
    @GeneratedValue
    private Integer Id;

    /**可通过教师Id查询该教师授课的所有课程Id，用于教务和教师界面*/
    private String teacherId;

    private String courseId;
}
