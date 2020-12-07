package com.bank.credit.service.Impl;

import com.bank.credit.dataobject.studentInfo;
import com.bank.credit.service.studentInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentInfoServiceImpl implements studentInfoService {
    @Override
    public List<studentInfo> findAll() {
        return null;
    }

    @Override
    public studentInfo findOne(String studentId) {
        return null;
    }

    @Override
    public studentInfo save(studentInfo student) {
        return null;
    }

    @Override
    public void delete(String studentId) {

    }
}
