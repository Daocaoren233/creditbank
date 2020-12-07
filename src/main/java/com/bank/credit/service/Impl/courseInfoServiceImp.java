package com.bank.credit.service.Impl;

import com.bank.credit.dataobject.courseInfo;
import com.bank.credit.service.courseInfoService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseInfoServiceImp implements courseInfoService {
    @Override
    public Page<courseInfo> findAll() {
        return null;
    }

    @Override
    public List<courseInfo> findUpAll() {
        return null;
    }

    @Override
    public Page<courseInfo> findAllByCourseType(Integer courseType) {
        return null;
    }

    @Override
    public List<courseInfo> findAllByCourseName(String courseName) {
        return null;
    }

    @Override
    public List<courseInfo> findAllByTeacherId(String teacherId) {
        return null;
    }

    @Override
    public courseInfo findOneByCourseId(String courseId) {
        return null;
    }

    @Override
    public void delete(String courseId) {

    }

    @Override
    public courseInfo save(courseInfo course) {
        return null;
    }
}
