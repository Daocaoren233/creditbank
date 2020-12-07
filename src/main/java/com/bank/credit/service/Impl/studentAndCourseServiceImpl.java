package com.bank.credit.service.Impl;

import com.bank.credit.dataobject.studentAndCourse;
import com.bank.credit.service.studentAndCourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentAndCourseServiceImpl implements studentAndCourseService {
    @Override
    public List<studentAndCourse> findAllByStudentId(String studentId) {
        return null;
    }

    @Override
    public List<studentAndCourse> findAllByCourseId(String courseId) {
        return null;
    }

    @Override
    public studentAndCourse findOneByStudentIdAndCourseId(String studentId, String courseId) {
        return null;
    }

    @Override
    public studentAndCourse save(studentAndCourse courseRelation) {
        return null;
    }

    @Override
    public studentAndCourse delete(Integer Id) {
        return null;
    }
}
