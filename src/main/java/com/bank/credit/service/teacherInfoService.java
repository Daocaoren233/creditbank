package com.bank.credit.service;

import com.bank.credit.dataobject.teacherInfo;

import java.util.List;

public interface teacherInfoService {
    List<teacherInfo> findAll();

    teacherInfo findOne(String teacherId);

    teacherInfo save(teacherInfo teacher);

    void delete(String teacherId);
}
