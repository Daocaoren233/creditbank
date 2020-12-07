package com.bank.credit.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
@NoArgsConstructor
public class courseType {
    /**课程类型的ID，可用随机函数生产*/
    @Id
    private Integer typeId;

    /**课程类型的名称，如数学*/
    private String typeName;

    /**课程类型的编号，如1*/
    private Integer courseType;

}
