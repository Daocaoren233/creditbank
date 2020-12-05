package com.bank.credit.repository;

import com.bank.credit.dataobject.studentAndCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface studentAndCourseRepository extends JpaRepository<studentAndCourse,Integer> {
    public List<studentAndCourse> findAllByStudentIdIn(String studentId);
    public List<studentAndCourse> findAllByCourseIdIn(String courseId);
}
