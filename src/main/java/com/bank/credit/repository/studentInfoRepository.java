package com.bank.credit.repository;

import com.bank.credit.dataobject.studentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentInfoRepository extends JpaRepository<studentInfo,String> {
}
