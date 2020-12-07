package com.bank.credit.service;

import com.bank.credit.dataobject.studentInfo;

import java.util.List;

public interface studentInfoService {
    List<studentInfo> findAll();

    studentInfo findOne(String studentId);

    studentInfo save(studentInfo student);

    void delete(String studentId);

}
