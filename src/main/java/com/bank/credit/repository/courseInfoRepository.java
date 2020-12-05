package com.bank.credit.repository;

import com.bank.credit.dataobject.courseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface courseInfoRepository extends JpaRepository<courseInfo,String> {
    public List<courseInfo> findAllByTeacherIdIn(String teacherId);
}
