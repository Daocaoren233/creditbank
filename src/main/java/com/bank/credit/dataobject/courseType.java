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
    @Id
    private Integer typeId;

    private String typeName;

    private Integer courseType;

}
