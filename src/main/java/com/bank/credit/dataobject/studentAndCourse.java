package com.bank.credit.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class studentAndCourse {
    /**只是序号*/
    @Id
    @GeneratedValue
    private Integer Id;

    /**学生的Id，可通过学生的Id，查询其所修课程的Id,学生界面使用*/
    private String studentId;

    /**课程的Id，可通过课程的Id，查询修该课程的所有学生Id，教师界面使用*/
    private String courseId;

}
