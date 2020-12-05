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
    @Id
    private Integer Id;

    private String studentId;

    private String courseId;

}
