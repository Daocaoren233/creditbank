package com.bank.credit.service.Impl;

import com.bank.credit.dataobject.courseType;
import com.bank.credit.service.courseTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseTypeServiceImpl implements courseTypeService {
    @Override
    public List<courseType> findAll() {
        return null;
    }

    @Override
    public courseType findOneByCourseType(Integer courseType) {
        return null;
    }

    @Override
    public courseType findOneByTypeName(String typeName) {
        return null;
    }

    @Override
    public courseType save(courseType coursetype) {
        return null;
    }

    @Override
    public void deleteByCourseType(Integer courseType) {

    }
}
