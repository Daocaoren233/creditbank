package com.bank.credit.service.Impl;

import com.bank.credit.dataobject.teacherInfo;
import com.bank.credit.service.teacherInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class teacherInfoServiceImpl implements teacherInfoService {
    @Override
    public List<teacherInfo> findAll() {
        return null;
    }

    @Override
    public teacherInfo findOne(String teacherId) {
        return null;
    }

    @Override
    public teacherInfo save(teacherInfo teacher) {
        return null;
    }

    @Override
    public void delete(String teacherId) {

    }
}
