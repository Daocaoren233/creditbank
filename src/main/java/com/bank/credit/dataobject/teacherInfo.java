package com.bank.credit.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class teacherInfo {
    @Id
    private String teacherId;

    private String teacherName;

    private String passWord;

    private String teacherPhone;

    private Integer teacherAge;

    private String teacherDescription;

}
