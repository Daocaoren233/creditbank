package com.bank.credit.service;

import com.bank.credit.dataobject.courseType;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface courseTypeService {
    List<courseType> findAll();

    courseType findOneByCourseType(Integer courseType);

    courseType findOneByTypeName(String typeName);

    courseType save(courseType coursetype);

    void deleteByCourseType(Integer courseType);
}
