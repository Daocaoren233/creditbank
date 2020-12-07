package com.bank.credit.service;

import com.bank.credit.dataobject.studentAndCourse;

import java.util.List;

public interface studentAndCourseService {
    List<studentAndCourse> findAllByStudentId(String studentId);

    List<studentAndCourse> findAllByCourseId(String courseId);

    studentAndCourse findOneByStudentIdAndCourseId(String studentId, String courseId);

    studentAndCourse save(studentAndCourse courseRelation);

    studentAndCourse delete(Integer Id);
}
