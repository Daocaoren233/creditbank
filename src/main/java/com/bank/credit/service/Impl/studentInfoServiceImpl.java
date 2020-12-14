package com.bank.credit.service.Impl;

import com.bank.credit.dataobject.studentInfo;
import com.bank.credit.repository.studentInfoRepository;
import com.bank.credit.service.studentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentInfoServiceImpl implements studentInfoService {
    @Autowired
    private studentInfoRepository studentRepository;

    @Override
    public List<studentInfo> findAll() {
        return null;
    }

    @Override
    public studentInfo findOne(String studentId) {
        return studentRepository.findOne(studentId);
    }

    @Override
    public studentInfo save(studentInfo student) {
        return null;
    }

    @Override
    public void delete(String studentId) {

    }
}
