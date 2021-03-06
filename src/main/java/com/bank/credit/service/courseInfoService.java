package com.bank.credit.service;

import com.bank.credit.dataobject.courseInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface courseInfoService {
    Page<courseInfo> findAll(Pageable pageable);

    List<courseInfo> findUpAll();

    Page<courseInfo> findAllByCourseType(Integer courseType);

    List<courseInfo> findAllByCourseName(String courseName);

    List<courseInfo> findAllByTeacherId(String teacherId);

    courseInfo findOneByCourseId(String courseId);

    void delete(String courseId);

    courseInfo save(courseInfo course);
}
